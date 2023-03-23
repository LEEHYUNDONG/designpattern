package com.hyundong.designpattern.strategy.after;

public class Roaming implements WalkingBehavior{
    @Override
    public void walk() {
        System.out.println("Roaming around");
    }
}
