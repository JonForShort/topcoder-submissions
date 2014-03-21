package com.thejunkjon.topcoder.pangramsentence;

/*
    A Pangram is a sentence that contains all the letters of the alphabet.  For example,
    the sentence "A quick brown fox jumps over the lazy dog" is a pangram.  Write a
    method that accepts a sentence (as a String) and returns all the letters it is
    missing which prevents it from being a pangram.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PangramSentence {

    private static final char[] CHARACTERS = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static List<Character> findMissingLetters(String sentence) {
        return getDifference(sanitizeString(sentence));
    }

    private static List<Character> getDifference(List<Character> sanitizedString) {
        List<Character> missingCharacters = new ArrayList<>();
        for (int i = 0, j = 0; i < CHARACTERS.length; i++) {
            if (sanitizedString.get(j).equals(CHARACTERS[i])) {
                j++;
            } else {
                missingCharacters.add(CHARACTERS[i]);
            }
        }
        return missingCharacters;
    }

    private static List<Character> sanitizeString(String s) {
        Set<Character> sanitizedString = new TreeSet<>();
        for (char c : s.replaceAll("\\s+", "").toLowerCase().toCharArray()) {
            sanitizedString.add(c);
        }
        return new ArrayList<>(sanitizedString);
    }
}
