package com.hyundong.designpattern.decorator.after;

public class ChickenSandwich extends Sandwich{

    public ChickenSandwich() {
        description = "Chicken Sandwich";
    }

    @Override
    public int cost() {
        return 1800;
    }
}

