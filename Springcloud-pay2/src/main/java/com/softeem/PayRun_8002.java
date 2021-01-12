package com.softeem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program:SpringCloud
 * @description:@todo
 * @author:Rage
 * @create:2020/10/8 22:00
 * @version: v1.0
 */
@SpringBootApplication
@EnableEurekaClient//开启eureka客户端
public class PayRun_8002 {

    public static void main(String[] args) {
        SpringApplication.run(PayRun_8002.class, args);
    }
}
