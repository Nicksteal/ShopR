
package com.uwetrottmann.shopr.algorithm;

import android.util.Log;

import com.uwetrottmann.shopr.algorithm.model.Attributes;
import com.uwetrottmann.shopr.algorithm.model.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AdaptiveSelection {

    private static final int NUM_RECOMMENDATIONS_DEFAULT = 8;
    private static final int BOUND_DEFAULT = 10;
    private static final int NUM_RECOMMENDATIONS_PRESELECTION = 9;

    private static final double ALPHA_BOUNDED_GREEDY_REFOCUS = 0.96;

    private static AdaptiveSelection _instance;

    public static synchronized AdaptiveSelection get() {
        if (_instance == null) {
            _instance = new AdaptiveSelection();
        }
        return _instance;
    }

    private List<Item> mCaseBase;
    private Query mQuery;
    private Critique mCurrentCritique;
    private int mNumRecommendations;
    private List<Item> mCurrentRecommendations;
    private Map<Integer, Integer> mAlreadySeenItems;

    private AdaptiveSelection() {
        mCaseBase = new ArrayList<Item>();
        mQuery = new Query();
        mNumRecommendations = NUM_RECOMMENDATIONS_DEFAULT;
        mCurrentRecommendations = new ArrayList<Item>();
        mAlreadySeenItems = new HashMap<Integer, Integer>();
    }

    /**
     * Call before {@link #getRecommendations()} to set the initial data
     * set. Resets the query.
     */
    public void setInitialCaseBase(List<Item> caseBase) {
        mQuery = new Query();
        mCurrentCritique = null;
        mCaseBase = caseBase;
    }

    /**
     * The maximum number of recommendations to return. Does not count the
     * carried item!
     */
    public void setMaxRecommendations(int limit) {
        mNumRecommendations = Math.max(1, limit);
    }

    /**
     * Returns a sorted list of recommendations based on the current query which
     * itself is shaped through passed critiques. The first time you may pass
     * {@code null} for the critique to get an initial set of diverse
     * recommendations.
     */
    public List<Item> getRecommendations() {
        // build a new set of recommendations
        List<Item> recommendations;
        // using adaptive selection (diversity on negative progress)

        double alpha = 0.997;

        recommendations = itemRecommend(mCaseBase, mQuery, mNumRecommendations, BOUND_DEFAULT, mCurrentCritique, NUM_RECOMMENDATIONS_PRESELECTION, mAlreadySeenItems, alpha);

        mCurrentRecommendations = recommendations;

        addItemsToAlreadySeenItems(recommendations);

        return recommendations;
    }

    public List<Item> getCurrentRecommendations() {
        return mCurrentRecommendations;
    }

    /**
     * Updates the item query, will influence the next set of recommendations.
     * Call {@link #getRecommendations()} afterwards.
     */
    public void submitCritique(Critique critique) {
        // Update the current query with the new critique
        if (critique != null) {
            queryRevise(mQuery, critique);
            mCurrentCritique = critique;
        }
    }

    /**
     * Returns the last critiqued item. May be {@code null}.
     */
    public Item getLastCritiquedItem() {
        if (mCurrentCritique != null) {
            return mCurrentCritique.item();
        }
        return null;
    }

    public Query getCurrentQuery() {
        return mQuery;
    }

    /**
     * Takes the current query, number of recommended items to return, the last
     * critique. Returns a list of recommended items based on the case-base.
     * @param numItemsPreSelection Determines how many items should be part of the initial algorithm to
     *                            be filtered against the context scenario.
     */
    private static List<Item> itemRecommend(List<Item> caseBase, Query query, int numItems, int bound, Critique lastCritique, int numItemsPreSelection, Map<Integer, Integer> alreadySeenItems, double alpha) {

        List<Item> recommendations;

        if ( lastCritique != null && lastCritique.item() != null
                && lastCritique.feedback().isPositiveFeedback()) {
            /*
             * Positive progress: user liked one or more features of one of the
             * recommended items.
             *
             * REFINE: Show similar recommendations by sorting the case-base in
             * decreasing similarity to current query. Return top k items.
             */
            long start = System.currentTimeMillis();
            recommendations = BoundedGreedySelection.boundedGreedySelection(query, caseBase, numItems, bound, alpha, alreadySeenItems);
            Log.d("AdaptiveSelection", "" + (System.currentTimeMillis() - start) + " ms");

        } else {
            /*
             * Negative progress: user disliked one or more of the features of
             * one recommended item. Or: first run.
             * REFOCUS: show diverse recommendations
             */
            recommendations = BoundedGreedySelection.boundedGreedySelection(query, caseBase, numItems, bound, ALPHA_BOUNDED_GREEDY_REFOCUS, alreadySeenItems);
        }

//        Utils.dumpToConsole(recommendations, query);

//        Utils.dumpToConsole(recommendations, query);

        // Carry the critiqued so the user may critique it further.
        if (lastCritique != null && lastCritique.item() != null) {
            // check if it is already in the list
            boolean isAlreadyPresent = false;
            for (Item item : recommendations) {
                if (item.id() == lastCritique.item().id()) {
                    isAlreadyPresent = true;
                    break;
                }
            }
            // if not: replace the last one with it
            if (!isAlreadyPresent) {
                recommendations.remove(recommendations.size() - 1);
                recommendations.add(lastCritique.item());
            }
        }

        return recommendations;
    }

    /**
     * Adds the items, which are in the current recommendation cycle to the items, that were already seen.
     * Furthermore the items, that are currently part of the list, are altered, such that they might again be part of the next cycle.
     * @param recommendations the list of items that are recommended
     */
    private void addItemsToAlreadySeenItems(List<Item> recommendations) {
        List<Integer> removeItems = new LinkedList<Integer>();
        for (Integer itemId : mAlreadySeenItems.keySet()){
            if (mAlreadySeenItems.get(itemId) == 1){
                removeItems.add(itemId);
            } else {
                mAlreadySeenItems.put(itemId, mAlreadySeenItems.get(itemId) - 1);
            }
        }

        //Delete the items.
        for (Integer itemId : removeItems){
            mAlreadySeenItems.remove(itemId);
        }

        for (Item item : recommendations){
            mAlreadySeenItems.put(item.id(), 3);
        }

        Log.d("Items",""+mAlreadySeenItems);
    }

    /**
     * Resets the already seen items to a new Map.
     */
    public void resetAlreadySeen(){
        mAlreadySeenItems = new HashMap<Integer, Integer>();
    }

    /**
     * Takes a liked/disliked item, which feature value was liked/disliked, the
     * current query. Returns a new query modified according to the given user
     * critique.
     */
    private static void queryRevise(Query query, Critique critique) {
        List<Attributes.Attribute> attributes = critique.feedback().attributes();
        for (Attributes.Attribute attribute : attributes) {
            critique.item().attributes().getAttributeById(attribute.id())
                    .critiqueQuery(query, critique.feedback().isPositiveFeedback());
        }
    }
}
