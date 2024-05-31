package com.techlabs.model;

public class Student {
	private int rollno;
	private String name;
	private int age;
	
	public void init() {
		age=22;
		name="Deepak";
		rollno=25581;
	}
	public void display() {
		System.out.println("Roll Number :"+rollno);
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
}
