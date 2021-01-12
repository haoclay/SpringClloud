package com.softeem.feigninterface;

import com.softeem.feigninterface.fallback.UserClidentFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//配置当前的服务名
@FeignClient(value = "springcloud-pay",fallback = UserClidentFallback.class)
@RequestMapping("/user")
public interface IUserClient {

    @RequestMapping("/findAll")
     Object finduser();

    @RequestMapping("/findTwo")
     Object findTwoPerson();
}
