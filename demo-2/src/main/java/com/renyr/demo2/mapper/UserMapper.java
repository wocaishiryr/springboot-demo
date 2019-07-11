package com.renyr.demo2.mapper;

import com.renyr.demo2.model.User;

import java.util.List;

public interface UserMapper {

    User selectById(String id);

    int insert(User user);

    int updateById(User user);

    List<User> selectList();

    int deleteById(String id);
}
