package com.hyundong.designpattern.strategy.after;


/*
공통적인 부분을 제외하고 자식 클래스에서 구현하게 만든다.
동물의 종에 따라 걷는 방식과 소리를 내는 방식이 다르다.
바뀌는 부분인 sound와 roaming만 따로 뽑아서 캡슐화 합니다.
 */
public abstract class Animal {

    private SoundBehavior soundBehavior;
    private WalkingBehavior walkingBehavior;

    public Animal(SoundBehavior soundBehavior, WalkingBehavior walkingBehavior){
        this.soundBehavior = soundBehavior;
        this.walkingBehavior = walkingBehavior;
    }


    public abstract void getAnimal();

    public void breed(){
        System.out.println("Breeding a newborn");
    };

    public void acting(){
        this.soundBehavior.makeSound();
    }

    public void walking(){
        this.walkingBehavior.walk();
    }


}
