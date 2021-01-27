package com.softeem.feigninterface;


import com.softeem.feigninterface.fallback.StudentClientFallback;
import com.softeem.feigninterface.fallback.UserClidentFallback;
import com.softeem.pojo.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Author : sgq
 * Date : 2021/1/13 14:03
 */
//@FeignClient(value = "springcloud-pay",fallback = StudentClientFallback.class)
//@RequestMapping("/student")
public interface IStudentClient {

    @RequestMapping("/findById")
      Object findById(Integer id);

}
