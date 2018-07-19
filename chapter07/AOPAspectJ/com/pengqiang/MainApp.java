package com.pengqiang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	// Êä³ö½á¹û£º
	// going to setup student profile.
	// has setup student profile.
	// result is: 21
	// going to setup student profile.
	// has setup student profile.
	// result is: Lily
	// going to setup student profile.
	// exception raised.
	// has setup student profile.
	// thers is exception: java.lang.IllegalArgumentException
	// {exception content ...}
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"main-app.xml");
		Student student = (Student)context.getBean("student");
		student.getAge();
		student.getName();
		student.pringException();
	}
}
