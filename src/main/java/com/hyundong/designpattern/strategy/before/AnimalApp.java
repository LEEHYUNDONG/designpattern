package com.hyundong.designpattern.strategy.before;

public class AnimalApp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();
        dog.roaming();
        cat.roaming();
    }
}
