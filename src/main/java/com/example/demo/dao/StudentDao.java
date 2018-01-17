package com.example.demo.dao;

import com.example.demo.model.Class;
import com.example.demo.model.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao extends IDao<Student> {
    /**
     * 根据 名字 与 班级 进行搜索
     * @param name
     * @return
     */
    List<Student> query(@Param("name") String name, @Param("class") Class clazz);
}
