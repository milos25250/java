package com.company;

public class Addition {
    private String name;
    private double price;

    public Addition(String name) {
        switch(name) {
            case "lettuce":
                this.name = "lettuce";
                this.price = 0.3;
                break;
            case "tomato":
                this.name = "tomato";
                this.price = 0.1;
                break;
            case "bacon":
                this.name = "bacon";
                this.price = 0.8;
                break;
            case "cheese":
                this.name = "cheese";
                this.price = 0.5;
                break;
            case "rucola":
                this.name = "rucola";
                this.price = 1.5;
                break;
            case "grass and dirt":
                this.name = "grass and dirt";
                this.price = 5;
                break;
            case "coke":
                this.name = "coke";
                this.price = 2;
                break;
            case "fries":
                this.name = "fries";
                this.price = 1.5;
                break;
            default:
                this.name = "";
                this.price = 0.0;
                break;
        }
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
