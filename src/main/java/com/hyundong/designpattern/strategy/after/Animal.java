package com.hyundong.designpattern.strategy.after;


/*
공통적인 부분을 제외하고 자식 클래스에서 구현하게 만든다.
동물의 종에 따라 걷는 방식과 소리를 내는 방식이 다르다.
 */
public interface Animal {

    void sound();

    void roaming();

}
