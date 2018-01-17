package com.example.demo.model;

/**
 * 课程
 */
public class Course extends BaseModel<Object> {
    // 课程名称
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
