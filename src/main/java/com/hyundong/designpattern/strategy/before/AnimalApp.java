package com.hyundong.designpattern.strategy.before;

public class AnimalApp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Dog");
        dog.sound();
        dog.roaming();
        dog.breed();

        System.out.println("Cat");
        cat.sound();
        cat.roaming();
        cat.breed();

    }
}
