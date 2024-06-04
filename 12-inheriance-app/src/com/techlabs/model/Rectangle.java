package com.techlabs.model;

public class Rectangle extends Shape{
	private int length,bredth;
	
	public Rectangle(int length, int bredth) {
		super();
		this.length = length;
		this.bredth = bredth;
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle is "+ length*bredth);
		
	}

}
