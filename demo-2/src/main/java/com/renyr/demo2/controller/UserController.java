package com.renyr.demo2.controller;

import com.renyr.demo2.model.User;
import com.renyr.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: springboot-demo
 * @description: 用户web接口层
 * @author: ryr
 * @Date: 2019-07-11 14:23
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("findOne")
    public User findOne(@RequestParam String id) {
        return userService.findOne(id);
    }

    @PostMapping("saveOrUpdate")
    public int saveOrUpdate( @RequestBody User user) {
        return userService.saveOrUpdate(user);
    }

    @GetMapping("findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @DeleteMapping("deleteById")
    public int deleteById(@RequestParam String id) {
        return userService.deleteById(id);
    }
}
