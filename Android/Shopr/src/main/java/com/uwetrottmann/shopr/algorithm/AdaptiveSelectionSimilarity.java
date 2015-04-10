
package com.uwetrottmann.shopr.algorithm;

import com.uwetrottmann.shopr.algorithm.model.Attributes;
import com.uwetrottmann.shopr.algorithm.model.Attributes.Attribute;

import java.util.List;

public class AdaptiveSelectionSimilarity {

    public static double similarity(Attributes first, Attributes second) {
        List<Attributes.Attribute> attrsSecond = second.getAllAttributes();

        int count = 0;
        double similarity = 0;

        // sum up similarity values for all attributes
        for (Attributes.Attribute attrSecond : attrsSecond) {
            /*
             * The query does only store new vectors for a feature once it has
             * been critiqued (others remain null). This speeds up processing by
             * avoiding useless comparisons (calculating similarity for
             * un-critiqued features).
             */
            Attributes.Attribute attrFirst = first.getAttributeById(attrSecond.id());
            if (attrFirst != null) {
                count++;
                similarity += attributeSimilarity(attrFirst, attrSecond);
            }
        }

        // if there are no comparable attributes, there is no similarity
        if (count == 0) {
            return 0;
        }

//        Log.d("Attr Sim", "" + second.getAllAttributesString() + (similarity / count));

        // average
        return similarity / count;
    }

    /**
     * Returns a similarity value between 0 and 1. The higher the more similar
     * are the weights of the attribute values.
     */
    public static double attributeSimilarity(Attribute first, Attribute second) {
        double similarity = 0;

        double[] valueWeightsFirst = first.getValueWeights();
        double[] valueWeightsSecond = second.getValueWeights();

        if (valueWeightsFirst==null||valueWeightsSecond==null) return 0;

        if (valueWeightsFirst.length != valueWeightsSecond.length) {
            throw new IllegalArgumentException("Attribute value weight vectors must be of same size.");
        }

        // sum up deltas
        int count = 0;
        for (int i = 0; i < valueWeightsFirst.length; i++) {
            if ( valueWeightsSecond[i] == 0.0) {
                // skip if both weights are 0
                continue;
            }
            count++;
//            Log.d("Weights", "Query: " + valueWeightsFirst[i] + " Item:" +valueWeightsSecond[i]);
            similarity += valueWeightsFirst.length * (1 - Math.abs(valueWeightsFirst[i] - valueWeightsSecond[i]));
        }

//        if (similarity > 0){
//            Log.d("Attr Sim", " " + second.currentValue() + " Sim:" + similarity + " Res:" +(similarity / count));
//        }

        // average
        return similarity / count;
    }

}
