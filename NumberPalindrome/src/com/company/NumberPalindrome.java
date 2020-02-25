package com.company;

public class NumberPalindrome {
    public static boolean isPalindrome(int num) {
        int original = num, reverse = 0, lastDigit;

        while (original != 0) {
            lastDigit = original % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            original /= 10;
        }

        return num == reverse;
    }
}
