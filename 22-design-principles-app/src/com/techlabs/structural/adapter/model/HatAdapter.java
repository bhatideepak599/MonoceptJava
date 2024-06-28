package com.techlabs.structural.adapter.model;

public class HatAdapter implements IItems {
	 private String name;
	 private double price;
	 public HatAdapter(Hat hat) {
		this.name=hat.getShortName()+hat.getLongname();
		this.price=hat.getBasePrice()+hat.getTaxPrice();
	}
	@Override
	public String itemname() {
		
		return name;
	}

	@Override
	public double getItemPrice() {
		
		return price;
	}
//composite design pattern
}
