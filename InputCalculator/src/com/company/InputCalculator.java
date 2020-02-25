package com.company;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, input, counter = 0;
        long avg;

        while (true){
            System.out.println("Enter a number:");

            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                sum += input;
                counter++;
            } else {
                avg = Math.round(sum / (double) counter);
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
    }
}
