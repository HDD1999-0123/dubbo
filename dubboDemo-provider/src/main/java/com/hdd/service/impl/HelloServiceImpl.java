package com.hdd.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hdd.service.HelloService;

/**
 * @ClassName:
 * @Descripton:
 * @author: hedd
 */
@Service//用dubbo的
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello:"+name;
    }
}
