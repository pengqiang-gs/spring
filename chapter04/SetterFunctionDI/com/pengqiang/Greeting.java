package com.pengqiang;

public class Greeting {

	private int count;
	private String content;
	
	public void greet() {
		System.out.println("greet count: " + this.count + ", greet content: " + this.content);
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
}
