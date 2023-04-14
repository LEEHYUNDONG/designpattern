package com.hyundong.designpattern.decorator.after;

public class AvocadoSandwich extends Sandwich{

    public AvocadoSandwich() {
        description = "Avocado Sandwich";
    }

    @Override
    public int cost() {
        return 2000;
    }
}

