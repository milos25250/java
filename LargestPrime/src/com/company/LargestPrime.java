package com.company;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1)
            return -1;

        int i = 2;

        for (; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
                System.out.println("if - no " + number + "\ni " + i);
            }
            System.out.println("end - no " + number + "\ni " + i);
        }

        return i;
    }
}
