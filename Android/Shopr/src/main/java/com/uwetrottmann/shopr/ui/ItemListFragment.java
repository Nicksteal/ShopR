
package com.uwetrottmann.shopr.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;
import com.uwetrottmann.androidutils.Maps;
import com.uwetrottmann.shopr.R;
import com.uwetrottmann.shopr.ShoprApp;
import com.uwetrottmann.shopr.adapters.ItemAdapter;
import com.uwetrottmann.shopr.algorithm.AdaptiveSelection;
import com.uwetrottmann.shopr.algorithm.Query;
import com.uwetrottmann.shopr.algorithm.model.Item;
import com.uwetrottmann.shopr.context.model.ScenarioContext;
import com.uwetrottmann.shopr.eval.Statistics;
import com.uwetrottmann.shopr.loaders.ItemLoader;

import java.util.List;
import java.util.Map;

import de.greenrobot.event.EventBus;

/**
 * Shows a list of clothing items the user can critique by tapping an up or down
 * vote button.
 */
public class ItemListFragment extends Fragment implements LoaderCallbacks<List<Item>>,
        ItemAdapter.OnItemCritiqueListener, ItemAdapter.OnItemDisplayListener {

    public static final String TAG = "Item List";

    // I = 9, T = 20
    private static final int LOADER_ID = 920;
    private static final int REQUEST_CODE = 12;
    private TextView mTextViewReason;
    private GridView mGridView;
    private ItemAdapter mAdapter;

    private boolean mIsInitialized;

    public static ItemListFragment newInstance() {
        return new ItemListFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_item_list, container, false);

        mTextViewReason = (TextView) v.findViewById(R.id.textViewItemListReason);
        mGridView = (GridView) v.findViewById(R.id.gridViewItemList);
        View emptyView = v.findViewById(R.id.textViewItemListEmpty);
        mGridView.setEmptyView(emptyView);

        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mAdapter = new ItemAdapter(getActivity(), this, this);

        mGridView.setAdapter(mAdapter);

        Bundle args = new Bundle();
        args.putBoolean("is init", false);
        getLoaderManager().initLoader(LOADER_ID, args, this);

        setHasOptionsMenu(true);
    }

    @Override
    public void onStart() {
        super.onStart();

        EventBus.getDefault().registerSticky(this, MainActivity.LocationUpdateEvent.class);
    }

    @Override
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.item_list, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_restart:
                onInitializeItems();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public Loader<List<Item>> onCreateLoader(int loaderId, Bundle args) {
        boolean isInit = false;
        if (args != null) {
            isInit = args.getBoolean("is init");
        }
        LatLng location = ShoprApp.getLastLocation();
        return new ItemLoader(getActivity(), location, isInit);
    }

    @Override
    public void onLoadFinished(Loader<List<Item>> loader, List<Item> data) {
        // is called as soon as the loader finishes.
        mAdapter.clear();
        mAdapter.addAll(data);
        Statistics.get().itemCoverageStatistics(data);
        StringBuilder text = new StringBuilder();
        for (String string : ScenarioContext.getInstance().getRelaxations()){
            text.append("\n - ");
            text.append(string);
        }

        if (text.length() != 0) {
            Toast.makeText(getActivity().getBaseContext(), getString(R.string.obtain_good_results) + text.toString(), Toast.LENGTH_LONG).show();
            Log.d("Relaxations", "" + ScenarioContext.getInstance().getRelaxations());
        }
        onUpdateReason();
        onUpdateShops(data);
    }

    public class ShopUpdateEvent {
        /**
         * Holds a list of shop ids and how many recommendations are shown for
         * each shop.
         */
        Map<Integer, Integer> shopMap;
    }

    /**
     * Post {@link ShopUpdateEvent} based on current list of recommendations.
     *
     * @param data the collection of shop data that should be updated
     */
    private void onUpdateShops(List<Item> data) {
        ShopUpdateEvent event = new ShopUpdateEvent();

        // get shops and number of items per shop
        event.shopMap = Maps.newHashMap();
        for (Item item : data) {
            int shopId = item.shopId();
            int count = 1;

            if (event.shopMap.containsKey(shopId)) {
                count = event.shopMap.get(shopId);
                count++;
            }

            event.shopMap.put(shopId, count);
        }

        EventBus.getDefault().postSticky(event);
    }

    private void onUpdateReason() {
        Query currentQuery = AdaptiveSelection.get().getCurrentQuery();
        // Display current reason as explanatory text
        String reasonString = currentQuery.attributes().getReasonString();
        if (TextUtils.isEmpty(reasonString)) {
            mTextViewReason.setText(R.string.reason_empty);
        } else {
            mTextViewReason.setText(reasonString);
        }
    }

    @Override
    public void onLoaderReset(Loader<List<Item>> loader) {
        mAdapter.clear();
    }

    @Override
    public void onItemDisplay(Item item) {
        // display details
        Intent intent = new Intent(getActivity(), ItemDetailsActivity.class);
        intent.putExtra(ItemDetailsActivity.InitBundle.ITEM_ID, item.id());
        intent.putExtra(ItemDetailsActivity.InitBundle.ITEM_POSITION, mAdapter.getPosition(item) + 1); // Start for counting is 0
        startActivity(intent);
    }

    @Override
    public void onItemCritique(Item item, boolean isLike) {
        startActivityForResult(new Intent(getActivity(), CritiqueActivity.class).putExtra(
                CritiqueActivity.InitBundle.IS_POSITIVE_CRITIQUE, isLike)
                .putExtra(CritiqueActivity.InitBundle.ITEM_ID, item.id()), REQUEST_CODE);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == Activity.RESULT_OK && requestCode == REQUEST_CODE) {
            Log.d(TAG, "Received recommendation update, requerying");
            getLoaderManager().restartLoader(LOADER_ID, null, this);
        }
    }

    /**
     * Wird beim Start aufgerufen.
     * @param event Location Update
     */
    public void onEvent(MainActivity.LocationUpdateEvent event) {
        if (!mIsInitialized) {
            Log.d(TAG, "Received location update, requerying");
            mIsInitialized = true;
            onInitializeItems();
        }
    }

    private void onInitializeItems() {
        AdaptiveSelection adaptiveSelection = AdaptiveSelection.get();
        adaptiveSelection.resetAlreadySeen();
        Bundle args = new Bundle();
        args.putBoolean("is init", true);
        //Here we have a loader with a unique ID, optional arguments and the implementation of the callbacks (this class)
        getLoaderManager().restartLoader(LOADER_ID, args, this);
    }
}