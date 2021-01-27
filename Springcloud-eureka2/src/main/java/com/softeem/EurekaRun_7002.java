package com.softeem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program:SpringCloud
 * @description:@todo
 * @author:Rage
 * @create:2020/10/8 21:26
 * @version: v1.0
 */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaServer//此注解表示该启动类是一个eureka注册中心启动类
public class EurekaRun_7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRun_7002.class, args);
    }
}
