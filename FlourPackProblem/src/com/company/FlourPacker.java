package com.company;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        while (goal > 0){
            if (goal >= 5) {
                if (bigCount > 0) {
                    goal -= 5;
                    bigCount -= 1;
                }
                else if (smallCount >= 5){
                    goal -= 1;
                    smallCount -= 1;
                } else
                    return false;
            }
            else if (smallCount >= goal){
                goal -= 1;
                smallCount -= 1;
            } else
                return false;
        }

        return goal == 0;
    }
}
