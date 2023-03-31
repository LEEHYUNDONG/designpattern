package com.hyundong.designpattern.observer.before;

public class AssignmentTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        Student student1 = new Student("student1", prof);
        Student student2 = new Student("student2", prof);


        // 과제 내줌
        prof.makeAssignment("Math", "Algebra chapter2");

        
        // 과제 전달 받음
        student1.setAssignment(prof.getAssignment());
        student2.setAssignment(prof.getAssignment());
        System.out.println("Assigment :" + student1.assignment.getSubject() + " " + student1.assignment.getContent());

        //과제 update 이루어짐
        prof.updateAssignment("Math", "Algebra chapter2 and chapter3");
        student1.setAssignment(prof.getAssignment());
        student2.setAssignment(prof.getAssignment());
        System.out.println("Changed Assigment :" + student1.assignment.getSubject() + " " + student1.assignment.getContent());
        
    }
}
