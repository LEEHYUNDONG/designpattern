package com.hyundong.designpattern.strategy.after;

public class Bark implements SoundBehavior {
    @Override
    public void makeSound() {
        barking();
    }

    public void barking(){
        System.out.println("Barking");
    }
}
