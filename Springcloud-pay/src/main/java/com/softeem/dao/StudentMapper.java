package com.softeem.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.softeem.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Author : sgq
 * Date : 2021/1/13 15:19
 */
public interface StudentMapper extends BaseMapper<Student> {

    @Select("select * from student where id = #{id}")
      Student selectById(@Param("id") Integer id);

}
