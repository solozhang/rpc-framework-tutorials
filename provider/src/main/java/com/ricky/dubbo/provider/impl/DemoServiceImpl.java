package com.ricky.dubbo.provider.impl;

import com.ricky.dubbo.demo.DemoService;

public class DemoServiceImpl implements DemoService {
 
    public String sayHello(String name) {
        return "Hello " + name;
    }
 
}