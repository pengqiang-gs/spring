package com.pengqiang;

public class Student {

	private Integer age;
	private String name;
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void pringException() {
		System.out.println("exception raised.");
		throw new IllegalArgumentException();
	}
}
