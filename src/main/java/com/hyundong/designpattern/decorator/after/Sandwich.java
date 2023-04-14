package com.hyundong.designpattern.decorator.after;

public abstract class Sandwich {
    String description = "no content";

    abstract int cost();

    public String getDescription(){
        return this.description;
    };
}

