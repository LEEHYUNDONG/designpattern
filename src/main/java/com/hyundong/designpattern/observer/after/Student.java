package com.hyundong.designpattern.observer.after;

public class Student implements Observer{
    private String name;

    private Assignment assignment;

    public Student(String name, Assignment assignment) {
        this.name = name;
        this.assignment = assignment;
        assignment.registerObserver(this);

    }

    @Override
    public void update(String subject, String content) {
        this.assignment.setSubject(subject);
        this.assignment.setContent(content);
        System.out.println("Name ->" + name + " subject ->" + this.assignment.getSubject() + " content ->" + this.assignment.getContent());
    }

}
