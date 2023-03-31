package com.hyundong.designpattern.observer.after;

import java.util.List;

public class Assignment implements Subject{

    private List<Observer> observers;
    private String subject;
    private String content;
    private boolean performed;

    @Override
    public void registerObserver(Observer o) {

    }

    @Override
    public void removeObserver(Observer o) {

    }

    @Override
    public void notifyObserver() {

    }
}
