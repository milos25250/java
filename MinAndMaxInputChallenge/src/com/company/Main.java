package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, input;

        while (true) {
            System.out.println("Enter a number:");

            if (scanner.hasNextInt()) {
                input = scanner.nextInt();

                if (min == Integer.MAX_VALUE || max == Integer.MIN_VALUE) {
                    min = input;
                    max = input;
                } else {
                    min = Math.min(input, min);
                    max = Math.max(input, max);
                }
            }
            else
                break;
        }

        System.out.println("min = " + min + ", max = " + max);
    }
}
