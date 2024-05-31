package com.techlabs.model;

public class Rectangle {
	private double width;
	private double height;
	
	public Rectangle() {
		this(10,10);
	}
	
	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
	}
	public Rectangle(double width) {
		this(width,8);
	}
	
	public void setWidth(double width) {
		this.width=width;
	}
	public double getWidth() {
		return width;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
}
