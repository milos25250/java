package com.company;

class Car {
    private boolean engine;
    private int cylinders, wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public void startEngine() {
        System.out.println("Car.startEngine() called, engine started");
    }

    public void accelerate(int amount) {
        System.out.println("Car.accelerate() called, accelerating to " + amount);
    }

    public void brake() {
        System.out.println("Car.brake() called, braking");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class DeLorean extends Car {
    public DeLorean() {
        super(6, "DeLorean");
    }

    @Override
    public void startEngine() {
        System.out.println("DeLorean.startEngine() called, engine started");
    }

    @Override
    public void accelerate(int amount) {
        System.out.println("DeLorean.accelerate() called, accelerating to " + amount);
        if (amount == 88)
            System.out.println("Whoops, we traveled back in time");
    }

    @Override
    public void brake() {
        System.out.println("DeLorean.brake() called, braking");
    }
}

class Yugo extends Car {
    public Yugo() {
        super(5, "Yugo");
    }

    @Override
    public void startEngine() {
        System.out.println("Yugo.startEngine() called, engine started");
    }

    @Override
    public void accelerate(int amount) {
        System.out.println("Yugo.accelerate() called, accelerating to " + amount);
        if (amount > 60)
            System.out.println("You are really optimistic");
    }

    @Override
    public void brake() {
        System.out.println("Yugo.brake() called, braking");
    }
}

class Dominus extends Car {
    public Dominus() {
        super(26, "Dominus");
    }

    @Override
    public void startEngine() {
        System.out.println("Dominus.startEngine() called, engine roaring in a thirst for blood");
    }

    @Override
    public void accelerate(int amount) {
        System.out.println("Dominus.accelerate() called, accelerating to " + amount * 2);
    }

    @Override
    public void brake() {
        System.out.println("Dominus.brake() called, braking failed, braking is for the weak");
    }
}

public class Main {

    public static void main(String[] args) {
//      displaying how polymorphism works by coding a generic class that has some mutations
//      in it's different forms by generating a random number between 1 and 3, then switching the
//      number and displaying appropriate mutations
        Car car;

        int randomNum = (int) (Math.random() * 3) + 1;
        switch (randomNum) {
            case 1:
                car = new DeLorean();
                break;
            case 2:
                car = new Yugo();
                break;
            case 3:
                car = new Dominus();
                break;
            default:
                car = null;
                break;
        }

        System.out.println("Name: " + car.getName()
                + "\nNo. of cylinders: " + car.getCylinders());
        car.startEngine();
        car.accelerate(88);
        car.brake();
    }
}
