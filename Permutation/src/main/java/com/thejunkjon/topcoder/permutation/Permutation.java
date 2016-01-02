package com.thejunkjon.topcoder.permutation;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

public class Permutation {

    static void permute(final List<Integer> a, final int k) {
        for (int i = k; i < a.size(); i++) {
            swap(a, i, k);
            permute(a, k + 1);
            swap(a, k, i);
        }
        if (k == a.size() - 1) {
            onPermutation(a);
        }
    }

    private static void onPermutation(List<Integer> a) {
        System.out.println(Arrays.toString(a.toArray()));
    }

    public static void main(String[] args) {
        permute(Arrays.asList(1, 2, 3), 0);
    }
}
