package com.techlabs.model;

import com.techlabs.test.TestStatic;

public class StaticDemo {
	
	private int number1;
	private static int number2;
	
	public StaticDemo(){
		System.out.println("Constructor");
		number1=0;
		number2=0;
	}
	public void increament() {
		 number1++;
		 number2++;
	}
	public void display() {
		System.out.println("Number1: "+number1);
		System.out.println("Number2: "+number2);
	}
	static
	{	
		System.out.println("Static block of class StaticDemo ");
	}
}
