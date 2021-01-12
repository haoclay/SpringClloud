package com.softeem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program:SpringCloud
 * @description:@todo
 * @author:Rage
 * @create:2020/10/8 21:26
 * @version: v1.0
 */

@SpringBootApplication
@EnableEurekaServer//此注解表示该启动类是一个eureka注册中心启动类
public class EurekaRun_7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRun_7001.class, args);
    }
}
