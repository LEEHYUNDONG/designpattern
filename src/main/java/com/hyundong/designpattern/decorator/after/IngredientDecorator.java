package com.hyundong.designpattern.decorator.after;

public abstract class IngredientDecorator extends Sandwich{
    Sandwich sandwich;

    public abstract String getDescription();

}
