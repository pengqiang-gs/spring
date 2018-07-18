package com.pengqiang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				HelloConfig.class);
		
		Hello hello = (Hello)context.getBean(Hello.class);
		hello.setMessage("Hello, Spring!");
		hello.getMessage();
	}
}
