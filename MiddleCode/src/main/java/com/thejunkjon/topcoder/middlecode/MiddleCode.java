package com.thejunkjon.topcoder.middlecode;

/**
 * Problem Statement
 * Hero is learning a new algorithm to encode a string. You are given a String s that consists of
 * lowercase letters only. Your task is to simulate the algorithm described below on this string,
 * so that Hero can see how it works.
 * <p/>
 * The algorithm starts with a given input string s and an empty output string t. The execution
 * of the algorithm consists of multiple steps. In each step, s and t are modified as follows:
 * If the length of s is odd, the middle character of s is added to the end of t, and
 * then deleted from s. If the length of s is even, the two characters in the middle of
 * s are compared. The smaller one of them (either one in case of a tie) is added to the
 * end of t, and then deleted from s. If after some step the string s is empty, the algorithm
 * terminates. The output of the algorithm is the final string t.
 * <p/>
 * Return the String t that will be produced by the above algorithm for the given String s.
 */

public class MiddleCode {

    public static String encode(final String input) {
        final StringBuilder t = new StringBuilder();
        final StringBuilder s = new StringBuilder(input);
        while (s.length() > 0) {
            final boolean sIsOdd = (s.length() % 2) != 0;
            final int middleIndex = (s.length() / 2);
            if (sIsOdd) {
                t.append(s.substring(middleIndex, middleIndex + 1));
                s.deleteCharAt(middleIndex);
            } else {
                char middleOne = s.charAt(middleIndex);
                char middleTwo = s.charAt(middleIndex - 1);
                if (middleOne < middleTwo) {
                    t.append(middleOne);
                    s.deleteCharAt(middleIndex);
                } else {
                    t.append(middleTwo);
                    s.deleteCharAt(middleIndex - 1);
                }
            }
        }
        return t.toString();
    }
}
