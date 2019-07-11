package com.renyr.demo2.service;

import java.util.List;

public interface BaseService<T> {
    T findOne(String id);

    int saveOrUpdate(T t);

    List<T> findAll();

    int deleteById(String id);
}
