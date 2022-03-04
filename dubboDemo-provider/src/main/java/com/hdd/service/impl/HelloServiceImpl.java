package com.hdd.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hdd.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName:
 * @Descripton:
 * @author: hedd
 */
//在服务提供者乙方提供负载均衡
//@Service(loadbalance = "random")//用dubbo的
//加上interfaceClass=HelloService.class，以解决加入事务后dubbo服务无法重启
@Service(interfaceClass = HelloService.class)//用dubbo的
@Transactional
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello:"+name;
    }
}
