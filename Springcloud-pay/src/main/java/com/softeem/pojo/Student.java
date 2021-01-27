package com.softeem.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * Author : sgq
 * Date : 2021/1/13 14:05
 */
@Data
@TableName(value = "student")
public class Student {
     @TableId(value = "id",type = IdType.AUTO)
     private Integer id ;
     @TableField("name")
     private String name;
     @TableField("phone")
     private String phone;
     @TableField("is_finished")
     private Integer isFinished;
     @TableField("teacher_id")
     private Integer teacherId;
     @TableField("is_exist")
     private Integer isExist;
     @TableField("create_time")
     private Date createTime;
}
