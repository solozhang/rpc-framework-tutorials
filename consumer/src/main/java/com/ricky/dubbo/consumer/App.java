package com.ricky.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ricky.dubbo.api.DemoService;
import com.ricky.dubbo.api.model.User;

/**
 * Dubbo Consumer client
 *
 */
public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "consumer.xml" });
		context.start();

		DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
		String hello = demoService.sayHello("ricky"); // 执行远程方法
		System.out.println(hello); // 显示调用结果
		
		User user = demoService.findUserById(15);
		System.out.println(user); // 显示调用结果
		
	}
}
