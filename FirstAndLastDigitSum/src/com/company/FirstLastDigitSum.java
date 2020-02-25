package com.company;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int num) {
        if (num < 0)
            return -1;
        else {
            int last = num % 10;

            while (num / 10 >= 1) {
                num /= 10;
            }

            return num + last;
        }
    }
}
