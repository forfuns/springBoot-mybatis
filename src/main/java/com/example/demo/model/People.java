package com.example.demo.model;

/**
 * 人员 抽象类
 */
public abstract class People extends BaseModel<Object> {

    // 姓名
    private String name;

    // 年龄
    private int age;

    // 性别 : 1男，2女，3未知
    private int gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

}
