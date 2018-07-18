package com.pengqiang;

import java.util.List;

public class HelloSpring {

	private Greeting greeting;
	
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
