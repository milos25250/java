package com.company;

public class Main {

    public static void main(String[] args) {
        BreadRoll bread = new BreadRoll(true);
        Meat meat = new Meat(false);
        Hamburger burger = new Hamburger(bread, meat);
        HealthyBurger overpriced = new HealthyBurger();
        DeluxeBurger notReally = new DeluxeBurger(bread, meat);
        burger.printPrice();
        overpriced.printPrice();
        notReally.printPrice();

        burger.add("lettuce");
        burger.add("bacon");
        burger.add("cheese");
        burger.add("tomato");
        burger.printPrice();

        burger.add("tomato");
        burger.printPrice();

        overpriced.add("lettuce");
        overpriced.add("bacon");
        overpriced.add("cheese");
        overpriced.add("tomato");
        overpriced.add("rucola");
        overpriced.add("grass and dirt");
        overpriced.printPrice();

        overpriced.add("tomato");
        overpriced.printPrice();

        notReally.add("tomato");
        notReally.printPrice();
    }
}
