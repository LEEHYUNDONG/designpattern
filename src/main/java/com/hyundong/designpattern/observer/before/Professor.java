package com.hyundong.designpattern.observer.before;

import java.util.ArrayList;
import java.util.List;

/**
 * 교수가 과제에 대한 값을 변경한다.
 * 이후 학생들이 과제 수행을 마치면 해당 과제에 대한 점수를 기입한다.
 */
public class Professor {

    public Assignment assignment;

    public List<Student> students = new ArrayList<>();


    public Assignment makeAssignment(String subject, String content){
        this.assignment = new Assignment(subject, content, false);
        return assignment;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void updateAssignment(String subject, String content){
        this.assignment.updateAssignment(subject, content);
        //한명 한명 과제를 변경해줘야 한다.
        for (Student student : students) {
            student.setAssignment(assignment);
        }
    }

    public List<Student> getStudentList(){
        return this.students;
    }
    /**
     * 과제가 Update 되면 과제가 바꼈다는 사실을 학생들에게 알린다.
     */
    public void notifyStudent(){
        System.out.println("*" + assignment.getSubject() + "* is changed to " + assignment.getContent());
    }

}
