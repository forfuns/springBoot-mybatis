package com.example.demo.service.impl;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student get(Object id) {
        return studentDao.get(id);
    }

    @Override
    public void save(Student student) {

        // 新数据基础初始化
        student.setId(UUID.randomUUID().toString().replaceAll("-",""));
        student.setCreateTime(new Date());

        studentDao.save(student);
    }

    @Override
    public void delete(Object id) {
        studentDao.delete(id);
    }

    @Override
    public List<Student> all() {
        return studentDao.all();
    }
}
