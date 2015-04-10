
package com.uwetrottmann.shopr.algorithm;

import android.util.Log;

import com.uwetrottmann.shopr.algorithm.model.Item;
import com.uwetrottmann.shopr.context.algorithm.ContextualPreFiltering;
import com.uwetrottmann.shopr.context.model.ScenarioContext;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Utils {

    /**
     * Returns a subset of the overall case base filtered by hard-limits like
     * location, availability and opening hours. <br/>
     * In the extended version (not for the baseline) it also returns items that were filtered by the stereotype settings of the user.
     */
    public static List<Item> getLimitedCaseBase(List<Item> wholeCaseBase, Map<Integer, Integer> alreadySeenItems) {
        List<Item> cases;

        //Pre-filter based on the current active scenario context.
        long start = System.currentTimeMillis();
        ScenarioContext scenarioContext = ScenarioContext.getACopy();
        cases = ContextualPreFiltering.filterShops(wholeCaseBase, scenarioContext);
        //Write the relaxations to the real instance
        ScenarioContext.getInstance().setRelaxations(scenarioContext.getRelaxations());
        Log.d("Context pre-filtering", ""+ (System.currentTimeMillis() - start) + " ms");

        cases = filterAlreadySeenItems(cases, alreadySeenItems);

//        //Do the calculation of stereotype proximity.
//        start = System.currentTimeMillis();
//        try {
//            User u = User.getUser();
//            if (u.hasStereotype()) {
//                StereotypeFiltering stereotypeFiltering = new StereotypeFiltering();
//                cases = stereotypeFiltering.computeStereotypeProximity(u.getStereotype(), cases);
//            }
//        } catch (RuntimeException re){
//            Log.d("User", "User object not initialized.");
//        }
//        Log.d("Stereotype filtering", ""+ (System.currentTimeMillis() - start) + " ms");

        return cases;
    }

    /**
     * Sorts items by similarity to query using the Sim function: sim(query,
     * item of caseBase).
     */
    public static List<Item> sortBySimilarityToQuery(Query query, List<Item> caseBase, Map<Integer, Integer> alreadySeenItems) {
        // Limit the case base (PRE-FILTERING)
        Log.d("CB before limiting", ""+caseBase.size());
        caseBase = getLimitedCaseBase(caseBase, alreadySeenItems);
        Log.d("CB after limiting", ""+caseBase.size());

        // calculate similarity value for each item
        for (Item item : caseBase) {
//            Log.d("Item", item.toString());
            item.querySimilarity(AdaptiveSelectionSimilarity.similarity(query.attributes(), item.attributes()));
        }

        // sort highest similarity first
        Collections.sort(caseBase, new AdaptiveSelectionComparator());

        //Get first item and take its similarity
        //divide all other item's similarities by this
        if (caseBase.size() > 0) {
            Double highestItemSimilarity = caseBase.get(0).querySimilarity();
            if ( highestItemSimilarity <= 0 || highestItemSimilarity.isNaN() ){
                for (Item item : caseBase) {
                    item.querySimilarity(1.0); // Set 1.0 if similarity was not set.
                }
            } else { // Entries already exist
                for (Item item : caseBase) {
                    item.querySimilarity((item.querySimilarity() / highestItemSimilarity)); //Scale from 0 to 1
                    //                Log.d("QuerySim after", "" + item.querySimilarity());
                }
            }
        }

        return caseBase;
    }

    public static void dumpToConsole(List<Item> cases, Query query) {
        if (query.attributes() != null) {
            System.out.println("Query " + query.attributes().getAllAttributesString());
        } else {
            System.out.println("Query EMPTY");
        }
        for (int i = 0; i < cases.size(); i++) {
            Item item = cases.get(i);
            Log.d("[" + i + "] Item", "" + item.attributes().getAllAttributesString()
                            + " sim " + item.querySimilarity()
                            + " qual " + item.quality()
                            + " stereo " + item.getProximityToStereotype());
        }
    }

    private static List<Item> filterAlreadySeenItems(List<Item> caseBase, Map<Integer, Integer> alreadySeenItems){
        List<Item> newCaseBase = new LinkedList<Item>();

        for (Item item: caseBase){
            if (alreadySeenItems.containsKey(item.id()) ){
                continue;
            }
            newCaseBase.add(item);
        }

        return newCaseBase;
    }

}
