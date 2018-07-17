package com.pengqiang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hello-bean.xml");
		HelloSpring obj = (HelloSpring)context.getBean("helloSpring");
		obj.getMessage();
	}
}
