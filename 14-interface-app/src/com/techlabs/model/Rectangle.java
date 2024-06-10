package com.techlabs.model;

public class Rectangle implements Shape {
	private double length;
	private double bredth;
	
	

	public Rectangle(double length, double bredth) {
		super();
		this.length = length;
		this.bredth = bredth;
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle is "+ length*bredth);
		

	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter of Rectangle is "+ 2*(length+bredth));
		
	}

}
