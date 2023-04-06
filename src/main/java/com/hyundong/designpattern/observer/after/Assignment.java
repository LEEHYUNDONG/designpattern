package com.hyundong.designpattern.observer.after;

import java.util.ArrayList;
import java.util.List;

public class Assignment implements Subject{

    private List<Observer> observers;
    private String subject;
    private String content;

    public Assignment() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(subject, content);
        }
    }

    public void assignmentChanged(){
        notifyObserver();
    }

    public void setAssignment(String subject, String content){
        this.subject = subject;
        this.content = content;
        assignmentChanged();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
