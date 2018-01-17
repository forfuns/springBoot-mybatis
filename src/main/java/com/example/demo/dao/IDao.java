package com.example.demo.dao;

import com.example.demo.model.BaseModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDao<T extends BaseModel> {

    T get(@Param("id") Object id);

    void save(T model);

    void update(T model);

    void delete(@Param("id") Object id);

    List<T> all();

}
