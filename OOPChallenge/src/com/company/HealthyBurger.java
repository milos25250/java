package com.company;

public class HealthyBurger extends Hamburger {
    public HealthyBurger() {
        super(new BreadRoll(false), new Meat(false));
    }

    @Override
    public void add(String name) {
        Addition currentAddition;

        switch(name) {
            case "lettuce":
            case "tomato":
            case "bacon":
            case "cheese":
            case "rucola":
            case "grass and dirt":
                if (getAdditions() == 6)
                    System.out.println(getClass().getSimpleName() + " can only have 6 additions");
                else {
                    currentAddition = new Addition(name);
                    this.price += currentAddition.getPrice();
                    this.additions++;
                }
                break;
            default:
                System.out.println("Invalid Value");
                break;
        }
    }
}
