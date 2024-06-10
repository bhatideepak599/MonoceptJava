package com.techlabs.model;

public class Outer {
	private int a=5;
	private void method() {
		System.out.println("Inside Method of outer class");
		
		
	}
	
	class Inner{
		int a=10;
		private void method2() {
			System.out.println(a);
			System.out.println("Inside Method of Inner class");

		}
		
	}
	public static void main(String[] args) {
		Outer outer=new Outer();
		Outer.Inner inner=outer.new Inner();
		outer.method();
		inner.method2();
	}
	
	
}
