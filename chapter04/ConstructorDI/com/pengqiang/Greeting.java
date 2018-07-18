package com.pengqiang;

public class Greeting {

	private int count;
	private String content;
	
	public Greeting(int count, String content) {
		this.count = count;
		this.content = content;
	}
	
	public void greet() {
		System.out.println("greet count: " + this.count + ", greet content: " + this.content);
	}
}
