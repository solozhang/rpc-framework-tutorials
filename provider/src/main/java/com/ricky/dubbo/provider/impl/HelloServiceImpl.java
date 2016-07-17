package com.ricky.dubbo.provider.impl;

import org.springframework.stereotype.Service;

import com.ricky.dubbo.api.HelloService;

@Service("helloService")
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHi(String msg) {
		
		return "Hello "+msg;
	}

}
