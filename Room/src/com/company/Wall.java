package com.company;

public class Wall {
    private double width, height;
    private String color;

    public Wall(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    private double getWidth() {
        return width;
    }

    private double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return getWidth() * getHeight();
    }
}
