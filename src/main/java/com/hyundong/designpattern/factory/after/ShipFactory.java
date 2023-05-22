package com.hyundong.designpattern.factory.after;

public interface ShipFactory {
    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();


        //notify
        sendEmailTo(email, ship);
        return ship;
    }

    private void sendEmailTo(String email, Ship ship){
        System.out.println(ship.getName() + " 다 만들었습니다.");
    };

    Ship createShip();
    private void validate(String name, String email){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("배 이름을 입력하시오");
        }
        if(email == null || email.isBlank()){
            throw new IllegalArgumentException("이메일을 입력하시오.");
        }
    }

    private void prepareFor(String name){
        System.out.println(name + " 만들 준비 중");
    }
}
