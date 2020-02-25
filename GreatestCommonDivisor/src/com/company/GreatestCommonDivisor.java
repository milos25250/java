package com.company;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
            return -1;

        int commonDivisor = 1;

        for (int i = 1; i <= Math.min(first, second); i++) {
            if (first % i == 0 && second % i == 0 && first % i == second % i)
                commonDivisor = i;
        }

        return commonDivisor;
    }
}
