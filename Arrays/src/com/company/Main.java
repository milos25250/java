package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] intArray = getInt(5);

	    for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element #" + i + ": " + intArray[i]);
        }

        System.out.println("The average is " + getAvg(intArray));
    }

    public static int[] getInt(int num) {
        System.out.println("Enter " + num + " integer values\r");
        int[] values = new int[num];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAvg(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return (double) sum / (double) arr.length;
    }
}
