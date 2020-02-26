package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("123", "Dell", "245", dimensions);

        Monitor monitor = new Monitor("241 ksm", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("sdgf23", "Asus", "v4.66", 4, 6);

        PC pc = new PC(theCase, monitor, motherboard);
        pc.powerUp();
    }
}
