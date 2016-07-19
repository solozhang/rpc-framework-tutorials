package com.ricky.codelab.dubbo.provider.impl;

import com.ricky.dubbo.api.HelloService;
import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHi(String msg) {
		
		return "Hello "+msg;
	}

}
