package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printArray(sortIntegers(getIntegers(5)));
    }

    public static int[] getIntegers(int arrLength) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[arrLength];

        System.out.println("INTEGER INPUT");
        for (int i = 0; i < arrLength;) {
            System.out.println("Enter #" + (i + 1) + " element");
            if (scanner.hasNextInt()) {
                arr[i] = scanner.nextInt();
                i++;
            }
            else System.out.println("Invalid Value");
            scanner.nextLine();
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element #" + (i + 1) + ": " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        int currentNum;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                currentNum = arr[j];

                if (arr[i] > arr[j]) {
                    arr[j] = arr[i];
                    arr[i] = currentNum;
                }
            }
        }

        return arr;
    }
}
