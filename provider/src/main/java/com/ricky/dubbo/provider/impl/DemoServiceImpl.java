package com.ricky.dubbo.provider.impl;

import com.ricky.dubbo.demo.DemoService;
import com.ricky.dubbo.demo.model.User;

public class DemoServiceImpl implements DemoService {
 
	@Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

	@Override
	public User findUserById(long id) {
		
		User user = new User();
		user.setId(id);
		user.setName("Ricky");
		user.setAge(26);
		
		return user;
	}
 
}