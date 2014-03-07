package com.thejunkjon.topcoder.middlecode;

import org.junit.Assert;
import org.junit.Test;

public class MiddleCodeTest {

    @Test
    public void testMiddleCodeOne() {
        Assert.assertTrue("ordw".equals(MiddleCode.encode("word")));
    }

    @Test
    public void testMiddleCodeTwo() {
        Assert.assertTrue("aaaaa".equals(MiddleCode.encode("aaaaa")));
    }

    @Test
    public void testMiddleCodeThree() {
        Assert.assertTrue("caabbaa".equals(MiddleCode.encode("abacaba")));
    }

    @Test
    public void testMiddleCodeFour() {
        Assert.assertTrue("ejghrs".equals(MiddleCode.encode("shjegr")));
    }

    @Test
    public void testMiddleCodeFive() {
        Assert.assertTrue("afawadafawafaafsadadaa".equals(MiddleCode.encode("adafaaaadafawafwfasdaa")));
    }
}
