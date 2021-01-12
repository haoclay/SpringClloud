package com.softeem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program:SpringCloud
 * @description:@todo
 * @author:Rage
 * @create:2020/10/9 21:31
 * @version: v1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class PayRun_8003 {
    public static void main(String[] args) {
        SpringApplication.run(PayRun_8003.class, args);
    }
}
