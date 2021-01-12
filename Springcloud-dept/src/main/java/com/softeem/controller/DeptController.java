package com.softeem.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.softeem.pojo.Dept;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @RequestMapping("/getDept/{id}")
    @HystrixCommand(fallbackMethod = "findDept",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//过多长时间，熔断器再次检测是否开启，默认为5000，即5s钟
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")//失败率达到多少跳闸
    })//配置访问出错时，调用findDept拖地方法
    public Object getDept(@PathVariable("id") int id){
        Dept dept = new Dept(1,"开发部");

        //int i=1/0;
        if(id<0){
            throw new RuntimeException("id不能为负数");
        }

        return dept;
    }

    public Object findDept(@PathVariable("id") int id){

        return "网络环境差";
    }
}
