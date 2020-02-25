package com.company;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0)
            System.out.println("Invalid Value");

        int reversed = reverse(number), lastDigit;

        for (int i = getDigitCount(number); i > 0; i--) {
            lastDigit = reversed % 10;

            switch (lastDigit) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
                    break;
            }

            reversed /= 10;
        }
    }

    public static int reverse(int num) {
        int reversed = 0;

        while (true) {
            reversed += num % 10;
            num /= 10;

            if (num == 0) {
                return reversed;
            }

            reversed *= 10;
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;

        int i = 1;

        for (; number >= 1;) {
            number /= 10;

            if (number == 0)
                return i;

            i++;
        }

        return i;
    }
}
