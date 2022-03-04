package com.hdd.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hdd.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName:
 * @Descripton:
 * @author: hedd
 */
@Controller
@RequestMapping("/demo")
public class HelloController {
    //在服务消费者一方配置负载均衡策略
    @Reference(check = false,loadbalance = "random")
    private HelloService helloService;
    @RequestMapping("/hello")
    @ResponseBody
    public String getName(String name){
    //远程调用
        String result = helloService.sayHello(name);
        System.out.println(result);
        return result;
    }
}
