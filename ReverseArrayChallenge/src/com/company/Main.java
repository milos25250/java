package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {
        int first, j = arr.length - 1, last = arr[j];

        for (int i = 0; i < arr.length / 2; i++) {
            first = arr[i];
            arr[i] = last;
            arr[j] = first;
            j--;
        }
    }
}
