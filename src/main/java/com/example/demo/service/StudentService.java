package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {

    Student get(Object id);

    void save(Student student);

    void delete(Object id);

    List<Student> all();

}
