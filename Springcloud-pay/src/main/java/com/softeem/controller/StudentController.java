package com.softeem.controller;

import com.softeem.dao.StudentMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author : sgq
 * Date : 2021/1/13 14:04
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired(required = false)
    private StudentMapper studentMapper;

    @RequestMapping("/findById")
    Object findById(@RequestParam Integer id){

      return  studentMapper.selectById(id);
    }

}
