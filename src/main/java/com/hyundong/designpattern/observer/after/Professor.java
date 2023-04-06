package com.hyundong.designpattern.observer.after;

import com.hyundong.designpattern.observer.after.Student;

public class Professor {
    public static void main(String[] args) {
        Assignment assignment1 = new Assignment();
        Student student1 = new Student("student1", assignment1);
        Student student2 = new Student("student2", assignment1);
        assignment1.setAssignment("Algebra1", "Ch1 and Ch2");
        assignment1.setAssignment("Algebra1", "Ch1 and Ch2 and Ch3");

    }
}
