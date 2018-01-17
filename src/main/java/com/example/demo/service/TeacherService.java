package com.example.demo.service;

import com.example.demo.model.Teacher;

import java.util.List;

public interface TeacherService {

    Teacher get(Object id);

    void save(Teacher teacher);

    void delete(Object id);

    List<Teacher> all();

    List<Teacher> query(String keyword);
}
