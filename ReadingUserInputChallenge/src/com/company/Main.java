package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter #" + i + " number: ");

            if (scanner.hasNextInt())
                sum += scanner.nextInt();
            else {
                System.out.println("Invalid Number");
                i--;
            }

            scanner.nextLine();
        }

        System.out.println("The sum is " + sum);
    }
}
