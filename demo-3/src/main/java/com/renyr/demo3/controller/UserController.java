package com.renyr.demo3.controller;

import com.renyr.demo3.model.User;
import com.renyr.demo3.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: springboot-demo
 * @description: 用户web接口层
 * @author: ryr
 * @Date: 2019-07-11 14:23
 */
@Api(tags = "用户web接口层")
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("根据主键查询用户信息")
    @GetMapping("findOne")
    public User findOne(@ApiParam(name = "主键") @RequestParam String id) {
        return userService.findOne(id);
    }

    @ApiOperation("新增或修改用户")
    @PostMapping("saveOrUpdate")
    public int saveOrUpdate(@ApiParam(name = "用户对象") @RequestBody User user) {
        return userService.saveOrUpdate(user);
    }

    @ApiOperation("查询所有用户")
    @GetMapping("findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @ApiOperation("根据主键删除用户信息")
    @DeleteMapping("deleteById")
    public int deleteById(@ApiParam(name = "主键") @RequestParam String id) {
        return userService.deleteById(id);
    }
}
