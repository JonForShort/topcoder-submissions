package com.thejunkjon.topcoder.magicstringdiv2;

import org.junit.Assert;
import org.junit.Test;

public class MagicStringDiv2Test {

    @Test
    public void testZero() {
        Assert.assertTrue(2 == MagicStringDiv2.minimalMoves(">><<><"));
    }

    @Test
    public void testOne() {
        Assert.assertTrue(0 == MagicStringDiv2.minimalMoves(">>>><<<<"));
    }

    @Test
    public void testTwo() {
        Assert.assertTrue(4 == MagicStringDiv2.minimalMoves("<<>>"));
    }

    @Test
    public void testThree() {
        Assert.assertTrue(20 == MagicStringDiv2.minimalMoves("<><<<>>>>><<>>>>><>><<<>><><><><<><<<<<><<>>><><><"));
    }

    @Test
    public void testFour() {
        Assert.assertTrue(5 == MagicStringDiv2.minimalMoves(">>><>>>>"));
    }
}

