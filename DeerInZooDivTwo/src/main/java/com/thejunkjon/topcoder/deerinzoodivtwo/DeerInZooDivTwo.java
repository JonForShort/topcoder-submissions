package com.thejunkjon.topcoder.deerinzoodivtwo;

/**
 * Brus and Gogo came to the zoo today. It's the season when deer shed their antlers. There are N
 * deer in the zoo. Initially, each deer had exactly two antlers, but since then some deer may
 * have lost one or both antlers. (Now there may be some deer with two antlers, some with one,
 * and some with no antlers at all.)
 * <p/>
 * Brus and Gogo went through the deer enclosure and they collected all the antlers already lost
 * by the deer. The deer have lost exactly K antlers in total. Brus and Gogo are now trying to
 * calculate how many deer have not lost any antlers yet.
 * <p/>
 * Return a int[] with exactly two elements {x,y}, where x is the smallest possible number of
 * deer that still have two antlers, and y is the largest possible number of those deer.
 * <p/>
 * <p/>
 * Definition
 * Class:	DeerInZooDivTwo
 * Method:	getminmax
 * Parameters:	int, int
 * Returns:	int[]
 * Method signature:	int[] getminmax(int N, int K)
 */
public final class DeerInZooDivTwo {

    public static int[] getminmax(int numberOfDeer, int numberOfLostAntlers) {
        return new int[]{
                getSmallestPossibleNumberOfDeer(numberOfDeer, numberOfLostAntlers),
                getMostPossibleNumberOfDeer(numberOfDeer, numberOfLostAntlers)
        };
    }

    private static int getMostPossibleNumberOfDeer(int numberOfDeer, int numberOfLostAntlers) {
        final int numberOfPossibleAntlers = (numberOfDeer * 2);
        final int numberOfAttachedAntlers = numberOfPossibleAntlers - numberOfLostAntlers;
        final int numberOfDeerWithFullAntlers = numberOfAttachedAntlers / 2;
        return Math.max(numberOfDeerWithFullAntlers, 0);
    }

    private static int getSmallestPossibleNumberOfDeer(int numberOfDeer, int numberOfLostAntlers) {
        if (numberOfLostAntlers > numberOfDeer) {
            return 0;
        } else if (numberOfLostAntlers == 0) {
            return numberOfDeer;
        } else {
            return numberOfDeer - numberOfLostAntlers;
        }
    }
}
