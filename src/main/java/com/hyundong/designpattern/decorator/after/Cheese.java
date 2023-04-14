package com.hyundong.designpattern.decorator.after;

public class Cheese extends IngredientDecorator{

    public Cheese(Sandwich sandwich){
        this.sandwich = sandwich;
    }
    @Override
    int cost() {
        return sandwich.cost() + 300;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + " + Cheese";
    }
}
