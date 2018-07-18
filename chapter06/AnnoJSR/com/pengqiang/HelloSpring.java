package com.pengqiang;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class HelloSpring {

	@Autowired
	private Greeting greeting;
	
	public void greet() {
		this.greeting.getGreetingMap();
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("HelloSpring class is initialized.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("HelloSpring class is destroyed.");
	}
}
