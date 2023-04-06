package com.hyundong.designpattern.decorator.before;

public abstract class Sandwich {

    String description = "Not ordered yet";

    public String getDescription(){
        return this.description;
    }

    abstract double cost();
}
