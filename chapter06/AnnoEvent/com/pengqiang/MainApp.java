package com.pengqiang;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	// Êä³ö½á¹û£º
	// ContextStartedEvent recved.
	// Hello, Spring!
	// ContextStoppedEvent recved.
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("main-app.xml");

		context.start();
		Hello hello = (Hello) context.getBean("hello");
		hello.getMessage();
		context.stop();
	}
}
