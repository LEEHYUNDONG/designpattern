package com.hyundong.designpattern.strategy.before;

public class Cat {
    void sound(){
        System.out.println("고양이가 울다.");
    }

    void roaming(){
        System.out.println("고양이가 사뿐사뿐 걷습니다.");
    }

    void breed(){
        System.out.println("새끼를 낳았습니다");
    }
}
