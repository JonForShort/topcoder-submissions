package com.thejunkjon.topcoder.tarostring;

import org.junit.Assert;
import org.junit.Test;

public class TaroStringTest {

    @Test
    public void testZero() {
        Assert.assertTrue("Possible".equals(TaroString.getAnswer("XCYAZTX")));
    }

    @Test
    public void testOne() {
        Assert.assertTrue("Impossible".equals(TaroString.getAnswer("CTA")));
    }

    @Test
    public void testTwo() {
        Assert.assertTrue("Impossible".equals(TaroString.getAnswer("ACBBAT")));
    }

    @Test
    public void testThree() {
        Assert.assertTrue("Possible".equals(TaroString.getAnswer("SGHDJHFIOPUFUHCHIOJBHAUINUIT")));
    }

    @Test
    public void testFour() {
        Assert.assertTrue("Impossible".equals(TaroString.getAnswer("CCCATT")));
    }
}

