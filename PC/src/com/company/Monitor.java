package com.company;

public class Monitor {
    private String model, manufacturer;
    private int size;
    private Resolution nativeRes;

    public Monitor(String model, String manufacturer, int size, Resolution nativeRes) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeRes = nativeRes;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel @" + x + ", " + y + " in color " + color);
    }
}
