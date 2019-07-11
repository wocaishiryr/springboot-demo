package com.renyr.demo3.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel("用户对象")
@Data
@TableName("USER")
public class User {

  @TableId(value = "id",type = IdType.UUID)
  private String id;
  private String name;
  private long age;
  private long gender;

}
