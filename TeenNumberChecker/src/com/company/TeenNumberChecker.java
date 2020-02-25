package com.company;

public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    private static boolean isTeen(int a) {
        return a > 12 && a < 20;
    }
}
