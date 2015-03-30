package com.uwetrottmann.shopr.algorithm;

import android.util.Log;

import com.uwetrottmann.shopr.algorithm.model.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class BoundedGreedySelection {

    /**
     * Chooses <code>bound*limit</code> items most similar to current query.
     * Returns <code>limit</code> items most similar to query and most
     * dissimilar to already selected items out of those.<br>
     * If there are less items than required, will still return (less)
     * recommendations.
     */
    public static List<Item> boundedGreedySelection(Query query, List<Item> caseBase, int limit, int bound, double alpha, Map<Integer, Integer> alreadySeenItems) {
        caseBase = Utils.sortBySimilarityToQuery(query, caseBase);

        // Get first b*k items
        int numItems = limit * bound;
        numItems = Math.min(numItems, caseBase.size());

        List<Item> limitedCaseBase = new ArrayList<Item>();
        for (int i = 0; i < numItems; i++) {
            limitedCaseBase.add(caseBase.get(i));
        }

        // add recommendations
        int numRecs = Math.min(limit, limitedCaseBase.size( ));

        //Delete previously stored data
        for (Item item : limitedCaseBase){
            item.setTemporaryQuality(0);
        }

        long start = System.currentTimeMillis();

        List<Item> recommendations = new ArrayList<Item>();

        Item lastAdded = null;
        for (int i = 0; i < numRecs; i++) {
            sortByQuality(limitedCaseBase, lastAdded, alpha, i);

            do {
                // get top item, remove it from remaining cases
                lastAdded = limitedCaseBase.remove(0);
            } while (alreadySeenItems.get(lastAdded.id()) != null); // if item is not found, we may display it
            recommendations.add(lastAdded);
        }

        Log.d("BoundedGreedySelect", "" + (System.currentTimeMillis() - start) + " ms");

        return recommendations;
    }

    /**
     * Calculates the quality for each item, sorts the case base with highest
     * quality first.
     * @param run the number of items that were already recommended
     */
    private static void sortByQuality(List<Item> caseBase, Item lastAdded, double alpha, int run) {
        double beta = 1 - alpha;
        // Calculate current quality
        for (Item item : caseBase) {
            item.quality(alpha * item.querySimilarity() + beta * relativeDiversity(item, lastAdded, run));
        }

        // sort by highest quality first
        Collections.sort(caseBase, new BoundedGreedyComparator());
    }

    /**
     * Calculates the relative diversity of an item to the current list of
     * recommendations.
     * @param run Number of recommendations already done.
     */
    private static double relativeDiversity(Item item, Item lastAdded, int run) {
        if (lastAdded == null) { //Means that we do not have an item to check against
            // default to 1 for R={}
            return 1;
        }

        item.setTemporaryQuality(item.getTemporaryQuality() + (1 - AdaptiveSelectionSimilarity.similarity(item.attributes(), lastAdded.attributes())));

        return item.getTemporaryQuality() / run;
    }

}