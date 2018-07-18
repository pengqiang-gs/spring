package com.pengqiang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	// Êä³ö½á¹û£º
	// Hello, obj1
	// Hello, Spring!
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hello-bean.xml");
		
		HelloSpring obj1 = (HelloSpring)context.getBean("helloSpring");
		obj1.setMessage("obj1");
		obj1.getMessage();
		
		HelloSpring obj2 = (HelloSpring)context.getBean("helloSpring");
		obj2.getMessage();
	}
}
