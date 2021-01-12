package com.softeem.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program:SpringCloud
 * @description:@todo
 * @author:Rage
 * @create:2020/10/9 20:43
 * @version: v1.0
 */
@Configuration
public class RestTemplateCfg {
    //"服务"消费者  服务提供者  注册中心  service  component

    //面向对象  用对象 new

    @Bean
    @LoadBalanced //开启服务消费者的负载均衡
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }

    //修改ribbon负载均衡策略，随机选着一个可用的服务器(默认是轮询)
    @Bean
    public IRule random(){
        return new RandomRule();
    }

    

}
