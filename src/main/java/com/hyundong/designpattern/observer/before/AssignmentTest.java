package com.hyundong.designpattern.observer.before;

public class AssignmentTest {
    public static void main(String[] args) {
        Professor prof = new Professor();

        //수강 신청(lecture 따로 만들지 않음)
        prof.addStudent(new Student("student1", prof));
        prof.addStudent(new Student("student2", prof));

        // 과제 내줌
        prof.makeAssignment("Math", "Algebra chapter2");

        System.out.println("--------------------------------------------------");
        System.out.println("\t\t\t\t 과제 전달");
        System.out.println("--------------------------------------------------");
        
        // 과제 전달 받음
        for (Student student : prof.getStudentList()) {
            student.setAssignment(prof.getAssignment());
            System.out.println("Assigment :" + student.assignment.getSubject() + " " + student.assignment.getContent());
        }

        System.out.println("--------------------------------------------------");
        System.out.println("\t\t\t\t 과제 변경");
        System.out.println("--------------------------------------------------");

        //과제 update 이루어짐
        prof.updateAssignment("Math", "Algebra chapter2 and chapter3");
        prof.notifyStudent();
        for (Student student : prof.getStudentList()) {
            System.out.println(student.getName() + " Changed Assigment :" + student.assignment.getSubject() + " " + student.assignment.getContent());
        }

        
        
    }
}
