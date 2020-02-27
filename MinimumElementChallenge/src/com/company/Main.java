package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//      NOTICE: known bug is that when unexpected value is entered, the app starts misbehaving
//              but ultimately gives the right result after correct inputs

        System.out.println("Enter how many number you would like to test");
        int[] arr = new int[0];
        if (scanner.hasNextInt()) {
            arr = readIntegers(scanner.nextInt());
        }
        else System.out.println("Invalid Value");
        scanner.nextLine();
        System.out.println(findMin(arr));
    }

    public static int[] readIntegers(int num) {
        int[] arr = new int[num];

        for (int i = 0; i < arr.length;) {
            System.out.println("Enter element #" + i + ":");

            if (scanner.hasNextInt()) {
                arr[i] = scanner.nextInt();
                i++;
            }
            else System.out.println("Invalid Value");
            scanner.nextLine();
        }

        return arr;
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        return min;
    }
}
