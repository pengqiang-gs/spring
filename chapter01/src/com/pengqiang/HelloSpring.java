package com.pengqiang;

public class HelloSpring {

	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("Hello, " + this.message);
	}
}
