package com.hyundong.designpattern.strategy.after;

public class Cat extends Animal{

    private SoundBehavior soundBehavior;
    private WalkingBehavior walkingBehavior;

    public Cat(SoundBehavior soundBehavior, WalkingBehavior walkingBehavior) {
        super(soundBehavior, walkingBehavior);
    }


    @Override
    public void getAnimal() {
        System.out.println("Cat");
    }
}
