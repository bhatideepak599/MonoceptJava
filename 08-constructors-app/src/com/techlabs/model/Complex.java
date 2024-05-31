package com.techlabs.model;

public class Complex {
	
	private double x;
	private double y;
	
	public Complex() {
		x=0;
		y=0;
	}
	
	public Complex(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Complex(int x) {
		this(x,0);
	}
	
	
	public void setX(int x) {
		this.x=x;
	}
	
	public double getX() {
		return x;
	}
	
	public void setY(int y) {
		this.x=x;
	}
	
	public double getY() {
		return y;
	}
	
	public Complex addComplex(Complex complex1,Complex complex2) {
		Complex answer=new Complex();
		
		answer.x= complex1.x+complex2.x;
		answer.y= complex1.y+complex2.y;
//		complex1.x+=complex2.x;
//		complex1.y+=complex2.y;
		
		
		return answer;
	}
	
}
