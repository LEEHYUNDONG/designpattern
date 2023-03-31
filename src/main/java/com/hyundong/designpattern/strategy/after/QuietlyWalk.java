package com.hyundong.designpattern.strategy.after;

public class QuietlyWalk implements WalkingBehavior{
    @Override
    public void walk() {
        System.out.println("Walking quietly");
    }
}
