package com.techlabs.model;

public class Employee {
	private String name;
	private String id;
	private double salary;
	
	public Employee() {
		name="";
		id="";
		salary=0.0;
		
	}
	public Employee(String name1,String id1,double salary1) {
		name=name1;
		id=id1;
		salary=salary1;
		
	}
	
	
	public void setName(String name1) {
		name=name1;
	}
	public String getName() {
		return name;
	}
	public void setId(String id1) {
		id=id1;
	}
	public String getId() {
		return id;
	}
	public void setSalary(double salary1) {
		salary=salary1;
	}
	public double getSalary() {
		return salary;
	}
}
