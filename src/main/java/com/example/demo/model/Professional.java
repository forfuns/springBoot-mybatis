package com.example.demo.model;

public class Professional extends BaseModel<Object> {

    // 专业名称
    private String title;

    //专业描述
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
