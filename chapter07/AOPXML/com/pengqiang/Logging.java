package com.pengqiang;

public class Logging {

	public void beforeAdvice() {
		System.out.println("going to setup student profile.");
	}
	
	public void afterAdvice() {
		System.out.println("has setup student profile.");
	}
	
	public void afterReturningAdvice(Object result) {
		System.out.println("result is: " + result.toString());
	}
	
	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("thers is exception: " + ex.toString());
	}
}
