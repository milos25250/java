package com.company;

public class Meat {
    private String type;
    private double price;

    public Meat(boolean isBeef) {
        if (isBeef)
            this.type = "beef";
        else
            this.type = "veggie";

        if (isBeef)
            this.price = 1.3;
        else this.price = 1.8;
    }

    public double getPrice() {
        return price;
    }
}
