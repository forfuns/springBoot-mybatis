package com.example.demo.dao;

import com.example.demo.model.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherDao extends IDao<Teacher> {

    /**
     * 根据名字搜索
     * @param name
     * @return
     */
    List<Teacher> query(@Param("name") String name);

}
