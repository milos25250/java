package com.company;

public class Car extends Vehicle {
    private int wheels, doors, roof, engine, gears, currentGear, mph;
    private String name;

    public Car(int weight, String color, int wheels, int doors, int gears, String name) {
        this(weight, color, wheels, doors, 1, 1, gears, 0, 0, name);
    }

    public Car(int weight, String color, int wheels, int doors, int roof, int engine, int gears, int currentGear, int mph, String name) {
        super(weight, color);
        this.wheels = wheels;
        this.doors = doors;
        this.roof = roof;
        this.engine = engine;
        this.gears = gears;
        this.mph = mph;
        this.name = name;
    }

    public void drive() {
        System.out.println("Car.drive() called, car is driving at " + getMph() + "MPH, in gear " + getCurrentGear());
    }

    public void accelerate(int amount) {
        if (amount < 1)
            System.out.println("You need to accelerate by at least 1");
        else if (
                (getMph() >= 0 && getMph() + amount < 21 && getCurrentGear() == 1)
                || (getMph() + amount < 31 && getCurrentGear() == 2)
                || (getMph() + amount < 41 && getCurrentGear() == 3)
                || (getMph() + amount < 100 && getCurrentGear() == 4)
                || (getMph() + amount < 100 && getCurrentGear() == 5)
        ) {
            this.mph += amount;
            System.out.println("Car.accelerate() called, accelerating by " + amount
                    + ", current MPH is " + getMph());
        } else System.out.println("Change the gear to accelerate further");
    }

    public void decelerate(int amount) {
        if (amount < 1)
            System.out.println("You need to decelerate by at least 1");
        else if (
                (getMph() > 0 && getMph() - amount > -1 && getCurrentGear() == 1)
                || (getMph() - amount > 17 && getCurrentGear() == 2)
                || (getMph() - amount > 27 && getCurrentGear() == 3)
                || (getMph() - amount > 37 && getCurrentGear() == 4)
                || (getMph() - amount > 47 && getCurrentGear() == 5)
        ) {
            this.mph -= amount;
            System.out.println("Car.decelerate() called, decelerating by " + amount
                    + ", current MPH is " + getMph());
        } else System.out.println("Change the gear to decelerate further");
    }

    public void changeGear(int gear) {
        if (gear < 1 || gear > getGears())
            System.out.println("Invalid gear number");
        else {
            if (
                    (getCurrentGear() == 0 && getMph() == 0 && gear == 1)
                    || (((getCurrentGear() == 1 && gear == 2) || (getCurrentGear() == 2 && gear == 1)) && getMph() > 17 && getMph() < 21)
                    || (((getCurrentGear() == 2 && gear == 3) || (getCurrentGear() == 3 && gear == 2)) && getMph() > 27 && getMph() < 31)
                    || (((getCurrentGear() == 3 && gear == 4) || (getCurrentGear() == 4 && gear == 3)) && getMph() > 37 && getMph() < 41)
                    || (((getCurrentGear() == 4 && gear == 5) || (getCurrentGear() == 5 && gear == 4)) && getMph() > 47 && getMph() < 100)
            ) {
                setCurrentGear(gear);
                System.out.println("Car.changeGear() called, changing gear to " + gear);
            }
            else System.out.println("Cannot change gear");
        }
    }

    @Override
    public void move(int speed) {
        drive();
        super.move(speed);
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getRoof() {
        return roof;
    }

    public void setRoof(int roof) {
        this.roof = roof;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getMph() {
        return mph;
    }

    public void setMph(int mph) {
        this.mph = mph;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
