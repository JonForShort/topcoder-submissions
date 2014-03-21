package com.thejunkjon.topcoder.pangramsentence;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static com.thejunkjon.topcoder.pangramsentence.PangramSentence.findMissingLetters;

public class PangramSentenceTest {

    @Test
    public void testOne() {
        List<Character> missingCharacters = findMissingLetters(
                "A quick brown fox jumps over the lazy dog");
        Assert.assertTrue(missingCharacters.size() == 0);
    }

    @Test
    public void testTwo() {
        List<Character> missingCharacters = findMissingLetters(
                "quick brown fox jumps over the lazy dog");
        Assert.assertTrue(missingCharacters.size() == 0);
    }

    @Test
    public void testThree() {
        List<Character> missingCharacters = findMissingLetters(
                "A brown fox jumps over the lazy dog");
        Assert.assertTrue(missingCharacters.size() == 4);
        Assert.assertArrayEquals(new Character[]{'c', 'i', 'k', 'q'},
                missingCharacters.toArray(new Character[missingCharacters.size()]));
    }
}

