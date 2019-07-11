package com.renyr.demo2.service.impl;

import com.renyr.demo2.mapper.UserMapper;
import com.renyr.demo2.model.User;
import com.renyr.demo2.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: springboot-demo
 * @description: 用户业务处理
 * @author: ryr
 * @Date: 2019-07-11 14:32
 */
@Log4j2
@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findOne(String id) {
        return userMapper.selectById(id);
    }

    @Transactional
    @Override
    public int saveOrUpdate(User user) {
        log.info("saveOrUpdate用户:"+user);
        if (StringUtils.isNoneBlank(user.getId())){
            return userMapper.updateById(user);
        } else {
            return userMapper.insert(user);
        }
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectList();
    }

    @Transactional
    @Override
    public int deleteById(String id) {
        log.info("删除用户id:"+id);
        return userMapper.deleteById(id);
    }
}
