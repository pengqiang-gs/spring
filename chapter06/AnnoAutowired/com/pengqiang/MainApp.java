package com.pengqiang;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	// Êä³ö½á¹û£º
	// HelloSpring class is initialized.
	// {1=Hello!, 2=Hi~, 3=Nice to meet you!}
	// HelloSpring class is destroyed.
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("hello-bean.xml");
		
		HelloSpring obj1 = (HelloSpring)context.getBean("helloSpring");
		obj1.greet();
		context.registerShutdownHook();
	}
}
