package com.techlabs.car;

public class Car extends FourWheeler{
	private double price;
	
	public Car(String companyName, double mileage,double price) {
		super(companyName, mileage);
		this.price=price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "[Company Name =" + getCompanyName()  + ", Mileage =" + getMileage()
				+ ", Price=" + price + "]";
	}
	
	

	
	
	
	
}
