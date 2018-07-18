package com.pengqiang;

import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

public class Greeting {

	private Map greetingMap;
	
	@Required
	public void setGreetingMap(Map greetingMap) {
		this.greetingMap = greetingMap;
	}

	public void getGreetingMap() {
		System.out.println(this.greetingMap);
	}
}
