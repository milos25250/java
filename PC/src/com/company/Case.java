package com.company;

public class Case {
    private String model, manufacturer, psu;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String psu, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.psu = psu;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}
