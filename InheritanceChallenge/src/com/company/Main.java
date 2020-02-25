package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(5, "red");
        Car car = new Car(6, "red", 4, 5, 5, "car");
        DeLorean dl = new DeLorean(8, "rad");

//        car.changeGear(1);
//        car.accelerate(18);
//        car.changeGear(2);
//        car.accelerate(12);
//        car.changeGear(3);
//        car.accelerate(10);
//        car.changeGear(4);
//        car.accelerate(12);
//        car.changeGear(5);
//        car.accelerate(47);

//        car.move(car.getMph());
//        car.steer(false);

//        car.decelerate(51);
//        car.changeGear(4);
//        car.decelerate(10);
//        car.changeGear(3);
//        car.decelerate(10);
//        car.changeGear(2);
//        car.decelerate(10);
//        car.changeGear(1);

        dl.changeGear(1);
        dl.accelerate(18);
        dl.changeGear(2);
        dl.accelerate(12);
        dl.changeGear(3);
        dl.accelerate(10);
        dl.changeGear(4);
        dl.accelerate(12);
        dl.changeGear(5);
        dl.accelerate(36);

        dl.move(dl.getMph());
        dl.steer(false);

        dl.decelerate(51);
        dl.changeGear(4);
        dl.decelerate(10);
        dl.changeGear(3);
        dl.decelerate(10);
        dl.changeGear(2);
        dl.decelerate(10);
        dl.changeGear(1);
    }
}
