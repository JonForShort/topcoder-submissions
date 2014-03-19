package com.thejunkjon.topcoder.wordlist;

import java.util.HashMap;
import java.util.Map;

/**
 * Given three lists of words, determine which list (A, B or C) has the highest score such that...
 * - If a list contains a unique word (not contained in any of the other 2 lists), the word receives three points.
 * - If a list contains a word that is contained in one other list, the word receives two points.
 * - If a list contains a word that is shared in all three lists, the word receives one point.
 * <p/>
 * A lists score is the sum of points that each word has received individually.
 * <p/>
 * Note, you may ignore case of each word.
 * <p/>
 * Example:
 * <p/>
 * List A { "hi", "how", "are", "you"}
 * List B { "hi" }
 * List C { "hi", "I", "am", "fine", "thanks", "how", "are", "you"}
 * <p/>
 * List A = 1 + 6 = 7 points.
 * 1 point for "hi" since shared in all other lists.
 * 2 points for "how", "are", "you" since also in List C.
 * <p/>
 * List B = 1 point.
 * 1 point for "hi" since shared in all other lists.
 * <p/>
 * List C = 1 + 6 + 12 = 19 points
 * 1 point for "hi" since shared in all other lists.
 * 2 points for "how", "are", "you" since also in List A.
 * 3 points for "I", "am", "fine", "thanks"
 * <p/>
 * Return "C"
 */

public class WordList {

    public static final char INVALID_TAG = 'X';

    public static char getHighestScore(final String[] a, final String[] b, final String[] c) {
        final Map<String, Integer> wordCountMap = new HashMap<>();
        Sentence[] sentences = new Sentence[]{
                new Sentence(a, 'A'),
                new Sentence(b, 'B'),
                new Sentence(c, 'C')
        };
        for (Sentence sentence : sentences) {
            sentence.addWordsToCount(wordCountMap);
        }
        int maxScore = 0;
        for (Sentence sentence : sentences) {
            maxScore = Math.max(maxScore, sentence.getScore(wordCountMap));
        }
        for (Sentence sentence : sentences) {
            if (maxScore == sentence.getScore(wordCountMap)) {
                return sentence.getTag();
            }
        }
        return INVALID_TAG;
    }
}

class Sentence {

    private final String[] mWords;

    private final char mTag;

    private int mScore = -1;

    public Sentence(final String[] words, final char tag) {
        mWords = words;
        mTag = tag;
    }

    public char getTag() {
        return mTag;
    }

    public void addWordsToCount(Map<String, Integer> wordCountMap) {
        for (String word : mWords) {
            final Integer count = wordCountMap.get(word);
            wordCountMap.put(word, count == null ? 1 : count + 1);
        }
    }

    public int getScore(Map<String, Integer> wordCountMap) {
        if (mScore < 0) {
            mScore = 0;
            for (String s : mWords) {
                final Integer count = wordCountMap.get(s);
                if (count != null) {
                    final int countOffset = 4;
                    mScore += countOffset - count;
                }
            }
        }
        return mScore;
    }
}