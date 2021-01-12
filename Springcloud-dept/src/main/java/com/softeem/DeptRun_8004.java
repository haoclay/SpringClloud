package com.softeem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix//开启熔断器
public class DeptRun_8004 {

    public static void main(String[] args) {
        SpringApplication.run(DeptRun_8004.class,args);
    }
}
