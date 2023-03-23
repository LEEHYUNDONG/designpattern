package com.hyundong.designpattern.strategy.after;

public class Dog extends Animal{


    public Dog(SoundBehavior soundBehavior, WalkingBehavior walkingBehavior) {
        super(soundBehavior, walkingBehavior);
    }


    @Override
    public void getAnimal() {
        System.out.println("Dog");
    }


}
