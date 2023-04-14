package com.hyundong.designpattern.decorator.after;

public class PorkSandwich extends Sandwich{

    public PorkSandwich() {
        description = "Pork Sandwich";
    }

    @Override
    public int cost() {
        return 1200;
    }
}
