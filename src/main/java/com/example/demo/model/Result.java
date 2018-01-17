package com.example.demo.model;

/**
 * 成绩
 */
public class Result extends BaseModel<Object> {
    // 学生
    private Student student;
    // 课程
    private Course course;
    // 得分
    private int score;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
