package com.thejunkjon.topcoder.deerinzoodivtwo;

import org.junit.Assert;
import org.junit.Test;

public class DeerInZooDivTwoTest {

    @Test
    public void testDeerInZooOne() {
        final int[] answer = DeerInZooDivTwo.getminmax(3, 2);
        Assert.assertTrue(answer[0] == 1);
        Assert.assertTrue(answer[1] == 2);
    }

    @Test
    public void testDeerInZooTwo() {
        final int[] answer = DeerInZooDivTwo.getminmax(3, 3);
        Assert.assertTrue(answer[0] == 0);
        Assert.assertTrue(answer[1] == 1);
    }

    @Test
    public void testDeerInZooThree() {
        final int[] answer = DeerInZooDivTwo.getminmax(10, 0);
        Assert.assertTrue(answer[0] == 10);
        Assert.assertTrue(answer[1] == 10);
    }

    @Test
    public void testDeerInZooFour() {
        final int[] answer = DeerInZooDivTwo.getminmax(654, 321);
        Assert.assertTrue(answer[0] == 333);
        Assert.assertTrue(answer[1] == 493);
    }

    @Test
    public void testDeerInZooFive() {
        final int[] answer = DeerInZooDivTwo.getminmax(100, 193);
        Assert.assertTrue(answer[0] == 0);
        Assert.assertTrue(answer[1] == 3);
    }
}

