package com.softeem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @program:SpringCloud
 * @description:@todo
 * @author:Rage
 * @create:2020/10/8 22:00
 * @version: v1.0
 */
@SpringBootApplication
@EnableEurekaClient//开启eureka客户端
@EnableHystrix
public class PayRun_8001 {

    public static void main(String[] args) {
        SpringApplication.run(PayRun_8001.class, args);
    }
}
