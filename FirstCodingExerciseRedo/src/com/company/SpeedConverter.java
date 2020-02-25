package com.company;

public class SpeedConverter {
    public static long toMilesPerHour (double kph) {
        if (kph < 0)
            return -1;
        else
            return Math.round(kph / 1.609);
    }

    public static void printConversion(double kph) {
        if (kph < 0)
            System.out.println("Invalid Value");
        else
            System.out.println(kph + " km/h = " + toMilesPerHour(kph) + " mi/h");
    }
}
