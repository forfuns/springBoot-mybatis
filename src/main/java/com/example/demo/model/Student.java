package com.example.demo.model;

/**
 * 学生
 */
public class Student extends People {

    // 所在班级
    private Class clazz;

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }
}

