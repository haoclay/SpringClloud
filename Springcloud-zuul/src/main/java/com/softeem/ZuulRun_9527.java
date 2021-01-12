package com.softeem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy//开启zuul网关
public class ZuulRun_9527 {

    public static void main(String[] args) {
        SpringApplication.run(ZuulRun_9527.class,args);
    }
}
