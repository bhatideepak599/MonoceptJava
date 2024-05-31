package com.techlabs.model;

public class Employee {
	private String name;
	private String id;
	private double salary;
	
	public void init(String name1,String id1,double salary1) {
		name=name1;
		id=id1 ;
		salary=salary1;
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Id : "+id);
		System.out.println("salary : "+salary);
		
	}
}
