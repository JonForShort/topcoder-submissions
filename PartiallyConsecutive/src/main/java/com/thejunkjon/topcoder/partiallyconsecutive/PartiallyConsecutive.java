package com.thejunkjon.topcoder.partiallyconsecutive;

import java.util.LinkedList;
import java.util.List;

public class PartiallyConsecutive {

    public Integer[] getMissingValues(int[] values) {
        Integer[] smallestValues = null;
        for (int i = 0; i < values.length; i++) {
            List<Integer> possibleValues = new LinkedList<Integer>();
            for (int j = 0; j < values.length / 2; j++) {
                possibleValues.add(values[i] + j);
            }
            for (int k = i; k < values.length; k++) {
                final Integer value = values[k];
                if (possibleValues.contains(value)) {
                    possibleValues.remove(value);
                }
            }
            if (smallestValues == null || smallestValues.length > possibleValues.size()) {
                smallestValues = possibleValues.toArray(new Integer[possibleValues.size()]);
            }
        }
        return smallestValues;
    }
}