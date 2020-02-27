package com.company;

public class Hamburger {
    private BreadRoll bread;
    private Meat meat;
    protected double price, additionsPrice;
    protected int additions;

    public Hamburger (BreadRoll bread, Meat meat) {
        this.bread = bread;
        this.meat = meat;
        this.price = bread.getPrice() + meat.getPrice();
        this.additions = 0;
    }

    public void add(String name) {
        Addition currentAddition;

        switch(name) {
            case "lettuce":
            case "tomato":
            case "bacon":
            case "cheese":
            case "coke":
            case "fries":
                if (getAdditions() == 4)
                    System.out.println(getClass().getSimpleName() + " can only have 4 additions");
                else {
                    currentAddition = new Addition(name);
                    this.price += currentAddition.getPrice();
                    this.additionsPrice += currentAddition.getPrice();
                    this.additions++;
                    System.out.println("Added " + currentAddition.getName()
                            + " for " + currentAddition.getPrice());
                }
                break;
            default:
                System.out.println("Invalid Value");
                break;
        }
    }

    public void printPrice() {
        System.out.println(getClass().getSimpleName() + " price: " + getPrice()
            + "\nAdditions: " + getAdditionsPrice()
            + "\n* * * * *"
            + "\n");
    }

    private double getPrice() {
        return price;
    }

    protected int getAdditions() {
        return additions;
    }

    protected double getAdditionsPrice() {
        return additionsPrice;
    }
}
