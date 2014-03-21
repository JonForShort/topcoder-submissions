package com.thejunkjon.topcoder.partiallyconsecutive;

import org.junit.Assert;
import org.junit.Test;

public class PartiallyConsecutiveTest {

    @Test
    public void testPartiallyConsecutiveOne() {
        Integer[] missingValues = new PartiallyConsecutive().getMissingValues(new int[]{
                1, 3, 7, 9, 11, 12
        });
        Assert.assertTrue(missingValues.length == 1);
        Assert.assertArrayEquals(missingValues, new Integer[]{2});
    }

    @Test
    public void testPartiallyConsecutiveTwo() {
        Integer[] missingValues = new PartiallyConsecutive().getMissingValues(new int[]{
                1, 3, 7, 9, 11, 12, 14, 15, 20, 25, 30, 40, 41, 42
        });
        Assert.assertTrue(missingValues.length == 2);
        Assert.assertArrayEquals(missingValues, new Integer[]{10, 13});
    }
}