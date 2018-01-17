package com.example.demo.dao;

import com.example.demo.model.Class;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassDao extends IDao<Class> {

    /**
     * 数据库统计班级学生总数
     * @param classId
     * @return
     */
    int studentCount(@Param("id") Object classId);
}
