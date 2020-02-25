package com.company;

public class Vehicle {
    private int body, weight;
    private String color;

    public Vehicle(int weight, String color) {
        this(1, weight, color);
    }

    public Vehicle(int body, int weight, String color) {
        this.body = body;
        this.weight = weight;
        this.color = color;
    }

    public void move(int speed) {
        System.out.println("Vehicle.move() called, vehicle moving at " + speed);
    }

    public void steer(boolean steeringLeft) {
        if (steeringLeft)
            System.out.println("Vehicle.steer() called, vehicle steering left");
        else
            System.out.println("Vehicle.steer() called, vehicle steering right");
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
