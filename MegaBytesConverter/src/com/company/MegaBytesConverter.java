package com.company;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kb) {
        if (kb < 0)
            System.out.println("Invalid Value");
        else {
            int mb, remainder = kb % 1024;
            mb = kb / 1024;

            System.out.println(kb + " KB = " + Math.round(mb) + " MB and " + remainder + " KB");
        }
    }
}
