package com.pengqiang;

public class HelloSpring {

	private Greeting greeting;
	
	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}
	
	public void greet() {
		greeting.greet();
	}
	
	public void initialize() {
		System.out.println("HelloSpring class is initialized.");
	}
	
	public void destroy() {
		System.out.println("HelloSpring class is destroyed.");
	}
}
