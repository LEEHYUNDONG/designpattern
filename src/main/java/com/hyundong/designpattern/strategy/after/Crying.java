package com.hyundong.designpattern.strategy.after;

public class Crying implements SoundBehavior{
    @Override
    public void makeSound() {
        crying();
    }

    public void crying(){
        System.out.println("Crying ..");
    }
}
