package com.pengqiang;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	// Êä³ö½á¹û£º
	// HelloSpring class is initialized.
	// greet count: 1, greet content: Hello, Spring!
	// HelloSpring class is destroyed.
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("hello-bean.xml");
		
		HelloSpring obj1 = (HelloSpring)context.getBean("helloSpring");
		obj1.greet();
		context.registerShutdownHook();
	}
}
