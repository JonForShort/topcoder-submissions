package com.thejunkjon.topcoder.bracket107;

/**
 * Correct bracket sequences are strings in which each character is a '(' or a ')', the total number of opening brackets is the same as the total number of closing brackets, and each prefix contains at least as many opening as closing brackets. For example, the shortest few correct bracket sequences are "", "()", "(())", and "()()".
 * <p>
 * The subsequence of a string S is any string that can be obtained by erasing zero or more characters of S. For example, each of the strings "", "ace", and "abcde" is a subsequence of "abcde".
 * <p>
 * We will use LCS(S,T) to denote the length of a longest common subsequence of strings S and T. In other words, LCS(S,T) is the largest k such that there is a string U of length k that is both a subsequence of S and a subsequence of T. For example, LCS("abcde","bad") = 2.
 * <p>
 * You are given a String s that contains a correct bracket sequence.
 * <p>
 * You are looking for a string t with the following properties:
 * -- t will have the same length as s,
 * -- t will be a correct bracket sequence,
 * -- t will not be equal to s,
 * -- LCS(s,t) will be as large as possible.
 * Compute and return the number of strings with these properties.
 */
public class Bracket107 {

    public static void main(String[] args) {

    }
}
