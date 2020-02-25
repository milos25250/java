package com.company;

public class DeLorean extends Car {
    private boolean canTimeTravel;

    public DeLorean(int weight, String color) {
        this(weight, color, 4, 3, 1, 1, 5, 0, 0, "DeLorean", true);
    }

    public DeLorean(int weight, String color, int wheels, int doors, int roof, int engine, int gears, int currentGear, int mph, String name, boolean canTimeTravel) {
        super(weight, color, wheels, doors, roof, engine, gears, currentGear, mph, name);
        this.canTimeTravel = canTimeTravel;
    }

    @Override
    public void accelerate(int amount) {
        if (this.getMph() + amount == 88)
            System.out.println("Whoops we traveled back in time");
        super.accelerate(amount);
    }

    public boolean isCanTimeTravel() {
        return canTimeTravel;
    }

    public void setCanTimeTravel(boolean canTimeTravel) {
        this.canTimeTravel = canTimeTravel;
    }
}
