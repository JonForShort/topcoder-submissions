package com.thejunkjon.topcoder.fibonacciinterval;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FibonacciIntervalTest {

    @Test
    public void testFibonacciOne() {
        final Integer[] values = new FibonacciInterval().getValuesBetween(2, 5);
        Assert.assertTrue(values.length == 3);
        Assert.assertTrue(Arrays.equals(values, new Integer[]{
                2, 3, 5
        }));
    }

    @Test
    public void testFibonacciTwo() {
        final Integer[] values = new FibonacciInterval().getValuesBetween(2, 150);
        Assert.assertTrue(values.length == 10);
        Assert.assertTrue(Arrays.equals(values, new Integer[]{
                2, 3, 5, 8, 13, 21, 34, 55, 89, 144
        }));
    }

    @Test
    public void testFibonacciThree() {
        final Integer[] values = new FibonacciInterval().getValuesBetween(1, 2);
        Assert.assertTrue(values.length == 3);
        Assert.assertTrue(Arrays.equals(values, new Integer[]{
                1, 1, 2
        }));
    }
}