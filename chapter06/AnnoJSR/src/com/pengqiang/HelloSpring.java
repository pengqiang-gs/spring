package com.pengqiang;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class HelloSpring {

	private Greeting greeting;
	
	@Resource(name="piapia")
	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}
	
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
