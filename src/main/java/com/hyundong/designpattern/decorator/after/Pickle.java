package com.hyundong.designpattern.decorator.after;

public class Pickle extends IngredientDecorator{

    public Pickle(Sandwich sandwich){
        this.sandwich = sandwich;
    }


    @Override
    int cost() {
        return sandwich.cost() + 200;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + " + pickle";
    }
}
