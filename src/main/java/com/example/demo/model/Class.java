package com.example.demo.model;

/**
 * 班级
 */
public class Class extends BaseModel<Object> {

    // 班级名称 (三班)
    private String name;

    // 班级所在专业
    private Professional professional;

    // 班主任
    private Teacher charge;

    // 年级 (3年)
    private int grade ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getCharge() {
        return charge;
    }

    public void setCharge(Teacher charge) {
        this.charge = charge;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Professional getProfessional() {
        return professional;
    }

    public void setProfessional(Professional professional) {
        this.professional = professional;
    }
}
