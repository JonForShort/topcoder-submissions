package com.thejunkjon.topcoder.boundingbox;

import org.junit.Assert;
import org.junit.Test;

public class BoundingBoxTest {

    @Test
    public void testOne() {
        Assert.assertTrue(1 == BoundingBox.getSmallestArea(
                new int[]{0, 1},
                new int[]{1, 0}));
    }

    @Test
    public void testTwo() {
        Assert.assertTrue(2 == BoundingBox.getSmallestArea(
                new int[]{0, -2, -1},
                new int[]{-1, -1, -2}));
    }

    @Test
    public void testThree() {
        Assert.assertTrue(12 == BoundingBox.getSmallestArea(
                new int[]{0, 0, 1, 0, -1, 2},
                new int[]{0, 1, 2, -2, 0, -1}));
    }

    @Test
    public void testFour() {
        Assert.assertTrue(25110 == BoundingBox.getSmallestArea(
                new int[]{9, -88, -40, 98, -55, 41, -38},
                new int[]{-65, 56, -67, 7, -58, 33, 68}));
    }
}

