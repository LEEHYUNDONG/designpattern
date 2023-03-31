package com.hyundong.designpattern.observer.before;


/**
 * 학생은 과제, 이름을 인스턴스로 가지고 있고,
 * 과제를 수행하고 해당 과제가 바뀌면 바뀐 과제를 수행해야 한다.
 */
public class Student {

    public String name;

    public Professor professor;
    public Assignment assignment;

    public Student(String name, Professor professor) {
        this.name = name;
        this.professor = professor;
    }

    public void doAssignment(){
        this.assignment.setPerformed(true);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }
}
