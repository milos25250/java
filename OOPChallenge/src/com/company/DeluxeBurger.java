package com.company;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(BreadRoll bread, Meat meat) {
        super(bread, meat);
        super.add("coke");
        super.add("fries");
    }

    @Override
    public void add(String name) {
        System.out.println("No additions allowed");
    }
}
