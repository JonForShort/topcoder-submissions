package com.thejunkjon.topcoder.magicstringdiv2;

/**
 * http://community.topcoder.com/stat?c=problem_statement&pm=13004
 * <p/>
 * Magical Girl Illy uses "magical strings" to cast spells. For her, a string X is magical if
 * and only if there exists a positive integer k such that X is composed of k consecutive '>'
 * characters followed by k consecutive '<' characters.
 * <p/>
 * Once Illy picked up a String S. The length of S was even, and each character of S was
 * either '<' or '>'. Illy wants to change S into a magical string. In each step, she can
 * change a single '>' to a '<' or vice versa. Compute and return the smallest number of
 * steps in which she can change S into a magical string.
 */

public class MagicStringDiv2 {

    public static int minimalMoves(final String s) {
        int count = 0;
        final String firstHalf = s.substring(0, s.length() / 2);
        for (char c : firstHalf.toCharArray()) {
            if (c == '<') {
                count++;
            }
        }
        final String lastHalf = s.substring(s.length() / 2);
        for (char c : lastHalf.toCharArray()) {
            if (c == '>') {
                count++;
            }
        }
        return count;
    }
}
