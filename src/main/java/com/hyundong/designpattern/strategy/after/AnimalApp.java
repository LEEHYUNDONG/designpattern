package com.hyundong.designpattern.strategy.after;

public class AnimalApp {
    public static void main(String[] args) {
        Animal dog = new Dog(new Bark(), new Roaming());
        Animal cat = new Cat(new Crying(), new QuietlyWalk());

        dog.getAnimal();
        dog.breed();
        dog.walking();
        dog.acting();

        cat.getAnimal();
        cat.breed();
        cat.walking();
        cat.acting();

    }


}
