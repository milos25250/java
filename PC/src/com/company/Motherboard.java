package com.company;

public class Motherboard {
    private String model, manufacturer, bios;
    private int ramSlots, cardSlots;

    public Motherboard(String model, String manufacturer, String bios, int ramSlots, int cardSlots) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.bios = bios;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }

    public void loadProgram(String program) {
        System.out.println("Program " + program + " loaded");
    }
}
