package com.hyundong.designpattern.factory.before;

public class ShipFactory {
    public static Ship orderShip(String name, String email){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("배 이름을 입력하시오");
        }
        if(email == null || email.isBlank()){
            throw new IllegalArgumentException("이메일을 입력하시오.");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        if (name.equalsIgnoreCase("ship")) {
            ship.setColor("white");
        }else if(name.equalsIgnoreCase("blackship")){
            ship.setColor("black");
        }

        sendEmailTo(email, ship);

        return ship;

    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(email + "의" + ship.getColor() + "colored " + ship.getName() + "라는 이름의 ship 입니다.");
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }
}
