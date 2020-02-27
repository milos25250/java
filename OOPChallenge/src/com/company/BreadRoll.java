package com.company;

public class BreadRoll {
    private String type;
    private double price;

    public BreadRoll(boolean isWhite) {
        if (isWhite)
            this.type = "white";
        else
            this.type = "brown rye";

        if (isWhite)
            this.price = 1.0;
        else this.price = 1.5;
    }

    public double getPrice() {
        return price;
    }
}
