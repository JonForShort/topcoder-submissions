package com.thejunkjon.topcoder.wordlist;

import org.junit.Assert;
import org.junit.Test;

public class WordListTest {

    @Test
    public void testWordListOne() {
        Assert.assertTrue('C' == WordList.getHighestScore(new String[]{
                "hi", "how", "are", "you"
        }, new String[]{
                "hi"
        }, new String[]{
                "hi", "how", "are", "you", "I", "am", "fine", "thanks"
        }));
    }

    @Test
    public void testWordListTwo() {
        Assert.assertTrue('A' == WordList.getHighestScore(new String[]{
                "hi"
        }, new String[]{
                "hi"
        }, new String[]{
                "hi"
        }));
    }

    @Test
    public void testWordListThree() {
        Assert.assertTrue('A' == WordList.getHighestScore(new String[]{
                "hi"
        }, new String[]{
                "hey"
        }, new String[]{
                "how"
        }));
    }

    @Test
    public void testWordListFour() {
        Assert.assertTrue('C' == WordList.getHighestScore(new String[]{
                "this", "is", "a", "test"
        }, new String[]{
                "this", "is"
        }, new String[]{
                "that", "is", "a", "test"
        }));
    }
}
