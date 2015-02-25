package com.uwetrottmann.shopr.algorithm;

import android.util.Log;

import com.uwetrottmann.shopr.algorithm.model.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoundedGreedySelection {

    public static final double ALPHA = 0.95;
    public static final double BETA = 1 - ALPHA;

    /**
     * Chooses <code>bound*limit</code> items most similar to current query.
     * Returns <code>limit</code> items most similar to query and most
     * dissimilar to already selected items out of those.<br>
     * If there are less items than required, will still return (less)
     * recommendations.
     */
    public static List<Item> boundedGreedySelection(Query query, List<Item> caseBase, int limit, int bound) {
        caseBase = Utils.sortBySimilarityToQuery(query, caseBase);

        // Get first b*k items
        int numItems = limit * bound;
        numItems = Math.min(numItems, caseBase.size());

        List<Item> limitedCaseBase = new ArrayList<Item>();
        for (int i = 0; i < numItems; i++) {
            limitedCaseBase.add(caseBase.get(i));
        }

        // add recommendations
        int numRecs = Math.min(limit, limitedCaseBase.size());

        //Delete previously stored data
        for (Item item : limitedCaseBase){
            item.setTemporaryQuality(0);
        }

        long start = System.currentTimeMillis();

        List<Item> recommendations = new ArrayList<Item>();

        Item lastAdded = null;
        for (int i = 0; i < numRecs; i++) {
            sortByQuality(limitedCaseBase, lastAdded);

            // get top item, remove it from remaining cases
            lastAdded = limitedCaseBase.remove(0);
            recommendations.add(lastAdded);
        }

        Log.d("BoundedGreedySelect", "" + (System.currentTimeMillis() - start) + " ms");

        return recommendations;
    }

    /**
     * Calculates the quality for each item, sorts the case base with highest
     * quality first.
     */
    private static void sortByQuality(List<Item> caseBase, Item lastAdded) {
        // Calculate current quality
        for (Item item : caseBase) {
            item.quality(ALPHA * item.querySimilarity() + BETA * relativeDiversity(item, lastAdded));
        }

        // sort by highest quality first
        Collections.sort(caseBase, new BoundedGreedyComparator());
    }

    /**
     * Calculates the relative diversity of an item to the current list of
     * recommendations.
     */
    private static double relativeDiversity(Item item, Item lastAdded) {
        if (lastAdded == null) { //Means that we do not have an item to check against
            // default to 1 for R={}
            return 1;
        }

        item.setTemporaryQuality(item.getTemporaryQuality() + (1 - AdaptiveSelectionSimilarity.similarity(item.attributes(), lastAdded.attributes())));

        return item.getTemporaryQuality();
    }

}
