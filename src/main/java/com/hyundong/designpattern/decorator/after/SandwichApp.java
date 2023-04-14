package com.hyundong.designpattern.decorator.after;

public class SandwichApp {
    public static void main(String[] args) {
        Sandwich sandwich = new PorkSandwich();
        sandwich = new Pickle(sandwich);
        sandwich = new Pickle(sandwich);
        sandwich = new Cheese(sandwich);

        System.out.println("What -> " + sandwich.getDescription());
        System.out.println("Cost -> " + sandwich.cost());
    }
}
