package com.pengqiang;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class HelloSpring {

	private Greeting greeting;
	
	@Required
	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}
	
	public void greet() {
		this.greeting.getGreetingMap();
	}
	
	public void initialize() {
		System.out.println("HelloSpring class is initialized.");
	}
	
	public void destroy() {
		System.out.println("HelloSpring class is destroyed.");
	}
}
