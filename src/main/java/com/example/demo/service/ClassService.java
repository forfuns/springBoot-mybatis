package com.example.demo.service;

import com.example.demo.model.Class;

import java.util.List;

public interface ClassService  {

    Class get(Object id);

    void save(Class clazz);

    void delete(Object id);

    List<Class> all();

    /**
     * 计算学生总数
     * @param classId
     * @return
     */
    int studentCount(Object classId);
}
