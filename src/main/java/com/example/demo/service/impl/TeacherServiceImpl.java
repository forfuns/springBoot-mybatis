package com.example.demo.service.impl;

import com.example.demo.dao.TeacherDao;
import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    public Teacher get(Object id) {
        return teacherDao.get(id);
    }

    @Override
    public void save(Teacher teacher) {
        // 新数据基础初始化
        teacher.setId(UUID.randomUUID().toString().replaceAll("-",""));
        teacher.setCreateTime(new Date());

        teacherDao.save(teacher);
    }

    @Override
    public void delete(Object id) {
        teacherDao.delete(id);
    }

    @Override
    public List<Teacher> all() {
        return teacherDao.all();
    }

    @Override
    public List<Teacher> query(String keyword) {

        return teacherDao.query(keyword);
    }


}
