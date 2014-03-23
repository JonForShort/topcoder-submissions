package com.thejunkjon.topcoder.tarostring;

/**
 * http://community.topcoder.com/stat?c=problem_statement&pm=13006
 * <p/>
 * Cat Taro has a string S. He wants to obtain the string "CAT" from the string S. In a single
 * turn he can choose any character and erase all occurrences of this character in S. He can do
 * as many turns as he wants (possibly zero). You are given the String S. Return
 * "Possible" (quotes for clarity) if it is possible to obtain the string "CAT" and
 * "Impossible" otherwise.
 * <p/>
 * Constraints
 * S will contain between 1 and 50 characters, inclusive.
 * S will contain only uppercase English letters ('A'-'Z').
 */

public class TaroString {

    private static final char[] ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static String getAnswer(String string) {
        for (char c : ALPHABET) {
            if (c == 'C' || c == 'A' || c == 'T') {
                continue;
            }
            string = string.replaceAll(Character.toString(c), "");
        }
        return string.equals("CAT") ? "Possible" : "Impossible";
    }
}
