package com.techlabs.model;

public class Student {
	private int rollno;
	private String name;
	private int age;
	
	public Student(){
		rollno=0;
		name="";
		age=0;
	}
	public Student(int rollno1,String name1,int age1){
		rollno=rollno1;
		name=name1;
		age=age1;
	}
	public void setRollno(int x1) {
		rollno=x1;
	}
	public int getRollno() {
		return rollno;
	}
	public void setName(String name1) {
		name=name1;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age1) {
		age=age1;
	}
	public int getAge() {
		return age;
	}
}
