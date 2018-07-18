package com.pengqiang;

import java.util.Map;

public class Greeting {

	private Map greetingMap;
	
	public void setGreetingMap(Map greetingMap) {
		this.greetingMap = greetingMap;
	}

	public void getGreetingMap() {
		System.out.println(this.greetingMap);
	}
}
