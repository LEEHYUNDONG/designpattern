package com.hyundong.designpattern.decorator.before;

public class Subway {
    public static void main(String[] args) {
        Ham ham = new Ham();
        Pickle pickle = new Pickle();
        Onion onion = new Onion();
        ShrededCheese cheese = new ShrededCheese();
        double cost = ham.cost() + pickle.cost() + onion.cost() + cheese.cost();
        System.out.println("cost ->$" + cost );
    }
}
