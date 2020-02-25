package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(NumberToWords.reverse(-123));
        System.out.println(NumberToWords.getDigitCount(11));
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);
    }
}
