package com.hyundong.designpattern.factory.before;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship ship = ShipFactory.orderShip("WhiteShip", "eastt@mail.com");
        System.out.println(ship);

        Ship ship1 = ShipFactory.orderShip("Blackship", "user2@mail.com");
        System.out.println(ship1);
    }
}
