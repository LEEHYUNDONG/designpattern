package com.hyundong.designpattern.observer.before;


/**
 * Assignment - 과제
 * 교수가 학생들에게 과제를 내준다. 과제는 매주 같은 과제가 나가지 않으며 과제가 나갈때 마다 score를 기록한다.
 */
public class Assignment {

    public String subject;
    public String content;
    public int score;
    public boolean performed;

    public Assignment(String subject, String content) {
        this.subject = subject;
        this.content = content;
    }

    public Assignment(String subject, String content, boolean performed) {
        this.subject = subject;
        this.content = content;
        this.performed = performed;
    }

    public void updateAssignment(String subject, String content){
        setSubject(subject);
        setContent(content);
    }

    public void setPerformed(boolean performed) {
        this.performed = performed;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
