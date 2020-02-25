package com.company;

public class EvenDigitSum {
    public static int getEvenDigitSum(int num) {
        if (num < 0)
            return -1;

        int last, sum = 0;

        while (num > 0) {
            last = num % 10;
            if (last % 2 == 0) {
                sum += last;
            }

            num /= 10;
        }

        return sum;
    }
}
