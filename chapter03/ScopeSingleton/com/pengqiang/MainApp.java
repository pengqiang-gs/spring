package com.pengqiang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	// 输出结果：
	// Hello, obj1
	// Hello, obj1
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hello-bean.xml");
		
		HelloSpring obj1 = (HelloSpring)context.getBean("helloSpring");
		obj1.setMessage("obj1");
		obj1.getMessage();
		
		HelloSpring obj2 = (HelloSpring)context.getBean("helloSpring");
		obj2.getMessage();
	}
}
