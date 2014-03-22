package com.thejunkjon.topcoder.boundingbox;

/**
 * Andrew drew a bunch of points on a sheet of graph paper. You are given the coordinates
 * of these points in two int[]s: X and Y. That is, for each valid i, there is a point at
 * the coordinates (X[i], Y[i]). Now Andrew wants to draw a rectangle. The sides of the
 * rectangle must be parallel to the coordinate axes. (In other words, each side of the
 * rectangle must be either horizontal or vertical.) Additionally, each of Andrew's points
 * must be inside the rectangle or on its boundary. Return the area of the smallest possible
 * rectangle Andrew can draw.
 */

public class BoundingBox {

    public static int getSmallestArea(final int[] xs, final int[] ys) {
        return getSideLength(xs) * getSideLength(ys);
    }

    private static int getSideLength(final int[] zs) {
        if (zs == null || zs.length < 1) {
            throw new IllegalArgumentException("must be specified");
        }
        int minZ = zs[0], maxZ = zs[0];
        for (int z : zs) {
            maxZ = Math.max(maxZ, z);
            minZ = Math.min(minZ, z);
        }
        return Math.abs(maxZ - minZ);
    }
}
