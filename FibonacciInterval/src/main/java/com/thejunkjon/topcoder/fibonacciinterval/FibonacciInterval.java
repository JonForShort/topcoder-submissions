package com.thejunkjon.topcoder.fibonacciinterval;

import java.util.ArrayList;
import java.util.List;

public class FibonacciInterval {

    public int mCurrentIndex = 0;

    public final List<Integer> mCurrentValues = new ArrayList<Integer>();

    public Integer[] getValuesBetween(final int start, final int end) {
        reset();
        int possible = 0;
        while (possible < start) {
            possible = getNextFib();
        }
        final List<Integer> intervalValues = new ArrayList<Integer>();
        while (possible <= end) {
            intervalValues.add(possible);
            possible = getNextFib();
        }
        return intervalValues.toArray(new Integer[intervalValues.size()]);
    }

    private int getNextFib() {
        final int nextFib = mCurrentIndex < 2 ? 1
                : mCurrentValues.get(mCurrentIndex - 2) + mCurrentValues.get(mCurrentIndex - 1);
        mCurrentValues.add(nextFib);
        mCurrentIndex++;
        return nextFib;
    }

    private void reset() {
        mCurrentValues.clear();
        mCurrentIndex = 0;
    }
}