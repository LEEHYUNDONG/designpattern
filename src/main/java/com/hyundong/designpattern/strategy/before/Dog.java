package com.hyundong.designpattern.strategy.before;

public class Dog {

    void sound(){
        System.out.println("강아지가 짖습니다.");
    }

    void roaming(){
        System.out.println("강아지가 걷는다.");
    }

    void breed(){
        System.out.println("새끼를 낳았습니다.");
    }
}
