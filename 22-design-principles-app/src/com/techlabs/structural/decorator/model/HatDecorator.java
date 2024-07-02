package com.techlabs.structural.decorator.model;

public abstract class HatDecorator implements IHat{
	IHat hat;

	public HatDecorator(IHat hat) {
		super();
		this.hat = hat;
	}
	
	@Override
	public String getName() {
		
		return hat.getName();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return hat.getPrice();
	}

	@Override
	public String getDescription() {
		
		return hat.getDescription();
	}

}
