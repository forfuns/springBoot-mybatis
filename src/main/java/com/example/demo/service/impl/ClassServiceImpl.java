package com.example.demo.service.impl;

import com.example.demo.dao.ClassDao;
import com.example.demo.model.Class;
import com.example.demo.model.Professional;
import com.example.demo.model.Teacher;
import com.example.demo.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassDao classDao;

    @Override
    public Class get(Object id) {

        return classDao.get(id);
    }

    @Override
    public void save(Class clazz) {
        // 新数据基础初始化
        clazz.setId(UUID.randomUUID().toString().replaceAll("-",""));
        clazz.setCreateTime(new Date());

        if(clazz.getCharge() == null){
            clazz.setCharge(new Teacher());
        }

        if(clazz.getProfessional() == null){
            clazz.setProfessional(new Professional());
        }

        classDao.save(clazz);
    }

    @Override
    public void delete(Object id) {
        classDao.delete(id);
    }

    @Override
    public List<Class> all() {

        return classDao.all();
    }

    @Override
    public int studentCount(Object classId) {
        return classDao.studentCount(classId);
    }
}
