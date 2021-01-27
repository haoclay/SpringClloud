package com.softeem.fengicai;

import com.softeem.feigninterface.fallback.StudentClientFallback;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: croyances
 * @Date: 2021/1/17 20:07
 * @version: 1.0
 */

@FeignClient(value = "springcloud-pay",url = "${url.user_student}")
public interface ICwhClient {

    @RequestMapping("/student/findById")
    Object findById(@RequestParam("id") Integer id);

    @RequestMapping("/user/findAll")
    Object finduser();

    @RequestMapping("/user/findTwo")
    Object findTwoPerson();
}
