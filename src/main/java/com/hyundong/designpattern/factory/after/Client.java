package com.hyundong.designpattern.factory.after;



public class Client {
    public static void main(String[] args) {
        Client client = new Client();

//        Ship ship = new WhiteShipFactory().orderShip("WhiteShip", "eastt@mail.com");
//        System.out.println(ship);
        client.print(new WhiteShipFactory(), "whiteship", "east@email.com");

    }

    private void print(ShipFactory shipFactory, String name, String email){
        System.out.println(shipFactory.orderShip(name, email));
    }
}
