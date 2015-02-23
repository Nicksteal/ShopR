package com.uwetrottmann.shopr.context.algorithm;

import android.database.Cursor;
import android.util.Log;

import com.uwetrottmann.shopr.ShoprApp;
import com.uwetrottmann.shopr.algorithm.model.Item;
import com.uwetrottmann.shopr.context.model.Company;
import com.uwetrottmann.shopr.context.model.DayOfTheWeek;
import com.uwetrottmann.shopr.context.model.DistanceMetric;
import com.uwetrottmann.shopr.context.model.ItemSelectedContext;
import com.uwetrottmann.shopr.context.model.ScenarioContext;
import com.uwetrottmann.shopr.context.model.Temperature;
import com.uwetrottmann.shopr.context.model.TimeOfTheDay;
import com.uwetrottmann.shopr.context.model.Weather;
import com.uwetrottmann.shopr.provider.ShoprContract;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by yannick on 17.02.15.
 *
 * In this class the post-filtering of the recommended cases is done. We will retrieve several different
 * items from the recommendation algorithm. Based on the current active context and the contexts in which these items
 * were selected, there is going to be a re-ordered list of the top x items.
 */
public class ContextualPostFiltering {

    private static String[] sSelectionColumns = new String[]{ShoprContract.ContextItemRelation.REF_ITEM_ID, ShoprContract.ContextItemRelation.CONTEXT_TIME, ShoprContract.ContextItemRelation.CONTEXT_DAY, ShoprContract.ContextItemRelation.CONTEXT_TEMPERATURE, ShoprContract.ContextItemRelation.CONTEXT_HUMIDITY, ShoprContract.ContextItemRelation.CONTEXT_COMPANY};

    /**
     * This method shall postFilter the provided item set of the case base in order to return better recommendations.
     * Therefore it takes a list of current preferred items by the algorithm and searches for contexts in which this item
     * was selected. It then checks these contexts with the current context and compares them based on the context's distance metric.
     *
     * @param currentRecommendation the current recommendations as set by the algorithm
     * @param numberOfRecommendations the number of recommendations that should be outputted
     * @return an updated list with only the number of items that should be outputted.
     */
    public static List<Item> postFilterItems(List<Item> currentRecommendation, int numberOfRecommendations){
        List<Item> updatedRecommendation = new ArrayList<Item>();

        //Updates the items, such that we can see in which contexts these items were selected
        retrieveContextInformationForItems(currentRecommendation);

        ScenarioContext scenarioContext = ScenarioContext.getInstance();

        int differentContextFactors = ItemSelectedContext.getNumberOfDifferentContextFactors();
        //TODO overall contexts set divided by differentContextFactors provides the number of situations in which this item was selected
        //TODO Set a maximum reachable value for the distance
        //TODO Select the minimums out of the calculated items
        //TODO Scale the individual item and its selected context with the overall number of all items (all contexts for all items)
        //TODO Optionally scale with the number of items by multiplying it.

        //Check that we have a scenario (real test)
        if (scenarioContext.isSet()) {

            //For each item: Calculate the distances
            for (Item item : currentRecommendation) {

                //Get the context for the item
                ItemSelectedContext itemContext = item.getItemContext();
                Map<DistanceMetric, Integer> distanceMetrics = itemContext.getContextsForItem(); //Get the contexts for the item

                int overallContextsSet = 0; // The number of context factors which are set for this item
                double overallItemDistance = 0; // The overall distance after summation of all factors without dividing
                for (DistanceMetric metric : distanceMetrics.keySet()) { //For each metric for the item
                    int times = distanceMetrics.get(metric);

                    double distance;
                    overallContextsSet += times;
                    if (metric.isMetricWithEuclideanDistance()){
                        // The -1 makes sure that we can have 1 as a distance, as when min is 0 and max 5, the number of items is 6, but should be 5 for the maximum distance.
                        distance = getAdaptedEuclideanDistance(scenarioContext.getDayOfTheWeek().currentOrdinal(), metric.currentOrdinal(), metric.numberOfItems() - 1.0);
                        distance = times * distance;
                    } else {
                        distance = times * metric.distanceToContext(scenarioContext);
                    }

                    //Multiply the distance with its weight, as they should not have their full weight
                    overallItemDistance = overallItemDistance + distance * metric.getWeight();

                    Log.d("" + metric, "" + distance);
                } // End for each metric within the contexts of a item

                Log.d("" + item, "Overall Distance: " + overallItemDistance );
                Log.d("Per Factor: ", ""+ (overallItemDistance / overallContextsSet) );

                if (overallContextsSet == 0){
                    //TODO Select the median if product was not set in any context
                }

            } // End for each item

        } //End check for scenario

        for (Item item : currentRecommendation){
            if (updatedRecommendation.size() < numberOfRecommendations) {
                updatedRecommendation.add(item);
            } else {
                break;
            }
        }

        return updatedRecommendation;
    }

    /**
     * Updates the items and sets the context scenarios in which these items have been selected.
     * @param currentRecommendation A list of items, that shall be part of the current recommendation cycle.
     */
    private static void retrieveContextInformationForItems(List<Item> currentRecommendation){
        for (Item item : currentRecommendation){

            //Set a new context for the item(s)
            ItemSelectedContext itemContext = new ItemSelectedContext();
            item.setItemContext(itemContext);

            //Query the database
            String selectionString = ShoprContract.ContextItemRelation.REF_ITEM_ID + " = " + item.id();
            Cursor query = ShoprApp.getContext().getContentResolver().query(ShoprContract.ContextItemRelation.CONTENT_URI,
                    sSelectionColumns, selectionString, null, null);

            //Move the information from the database into the data structure
            if (query != null){
                while (query.moveToNext()){
                    itemContext.increaseDistanceMetric(TimeOfTheDay.getTimeOfTheDay(query.getInt(1)));
                    itemContext.increaseDistanceMetric(DayOfTheWeek.getDayOfTheWeek(query.getInt(2)));
                    itemContext.increaseDistanceMetric(Temperature.getTemperature(query.getInt(3)));
                    itemContext.increaseDistanceMetric(Weather.getWeather(query.getInt(4)));
                    itemContext.increaseDistanceMetric(Company.getCompany(query.getInt(5)));
                }

                query.close();
            }

//            Log.d("Item Context: ", ""+ itemContext);
        }
    }

    /**
     * This method returns the adapted euclidean distance as described in the HEOM
     * @param p the value for the coordinate of the first object
     * @param q the value for the coordinate of the second object
     * @param range the difference between the highest and the lowest number in the range
     * @return a double with the distance
     */
    private static double getAdaptedEuclideanDistance(double p, double q, double range){
        double result = ( p - q ) / range;
        result = Math.pow(result, 2); // square it
        return Math.sqrt(result);
    }
}