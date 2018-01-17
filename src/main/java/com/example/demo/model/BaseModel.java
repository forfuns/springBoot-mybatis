package com.example.demo.model;

import java.util.Date;

public abstract class BaseModel<T extends Object> {

    private T id;
    private Date createTime;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
