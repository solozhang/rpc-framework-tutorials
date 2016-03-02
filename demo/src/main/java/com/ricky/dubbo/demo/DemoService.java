package com.ricky.dubbo.demo;

import com.ricky.dubbo.demo.model.User;

public interface DemoService {
 
	public String sayHello(String name);
 
    public User findUserById(long id);
}