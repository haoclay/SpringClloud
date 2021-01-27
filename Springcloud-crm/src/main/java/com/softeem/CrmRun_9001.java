package com.softeem;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program:SpringCloud
 * @description:@todo
 * @author:Rage
 * @create:2020/10/9 20:38
 * @version: v1.0
 */
@ComponentScan(basePackages = "com.softeem.*")
@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class,DataSourceAutoConfiguration.class})
@EnableEurekaClient
//@EnableFeignClients(basePackages = "com.softeem.feigninterface")//去扫描服务提供者的feign接口
@EnableFeignClients(basePackages = "com.softeem.fengicai")//去扫描服务提供者的feign接口
public class CrmRun_9001 {

    public static void main(String[] args) {
        SpringApplication.run(CrmRun_9001.class, args);
        //帮助我们去注册中心找到提供者调用 http://localhost:8001/user/findAll
        //Spring提供的restemplate
    }
}
