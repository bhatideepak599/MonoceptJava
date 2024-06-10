package com.techlabs.model;

import com.techlabs.exception.AgeNotValidException;

public class Voter {
	int age;
	String name;
	public Voter( String name,int age) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void vote() {
		if(age<18) 
			throw new AgeNotValidException();
		System.out.println(name+" has casted his vote.");
	}
	
}
