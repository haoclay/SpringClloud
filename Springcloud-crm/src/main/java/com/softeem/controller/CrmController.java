package com.softeem.controller;

import com.softeem.fengicai.ICwhClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program:SpringCloud
 * @description:@todo
 * @author:Rage
 * @create:2020/10/9 20:47
 * @version: v1.0
 */
@RestController
@RequestMapping("/crm")
public class CrmController {

    @Autowired
    private RestTemplate restTemplate;

    //当前去调用 pay  feign+ribbon:这里服务消费者通过接口去调用    调用就去想调用接口 dao层接口 service层接口
    @RequestMapping("/findAll.do")
    public String findAll(){
       //使用spring的RestTemplate调用远程的服务提供者Springcloud-pay
        //服务消费者怎么调用服务？
        String url = "http://springcloud-pay/user/findAll";  //反射去拿到当前url所以的内容

        String string = restTemplate.getForObject(url, Object.class).toString();

        return string;
    }

    //feign 里面默认就是豪猪和ribbon

//    @Autowired
//    private IUserClient userClient;
    @Autowired
    private ICwhClient client;

    @RequestMapping("/findAll")
    public Object finduser(){
        String s = client.finduser().toString();
        return s;
    }

    @RequestMapping("/findTwo")
    public Object findOne(){
        String s = client.findTwoPerson().toString();
        return s;
    }
    @RequestMapping("/findStudentById.do")
    public Object findStudentById(@RequestParam Integer id){
       return  client.findById(id);
    }
}
