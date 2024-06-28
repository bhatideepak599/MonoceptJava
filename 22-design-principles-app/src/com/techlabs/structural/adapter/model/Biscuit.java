package com.techlabs.structural.adapter.model;

public class Biscuit implements IItems {
	
	private String name;
	private double mrp;
	
	public Biscuit(String name, double mrp) {
		super();
		this.name = name;
		this.mrp = mrp;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	

	public void setMrp(double mrp) {
		this.mrp = mrp;
	}

	@Override
	public String itemname() {
		
		return name;
	}

	@Override
	public double getItemPrice() {
		
		return mrp;
	}

}
