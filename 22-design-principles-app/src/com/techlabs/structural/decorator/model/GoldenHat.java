package com.techlabs.structural.decorator.model;

public class GoldenHat extends HatDecorator {

	public GoldenHat(IHat hat) {
		super(hat);
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Golden and "+ hat.getName();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 500+hat.getPrice();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return hat.getDescription()+" and its Golden";
	}

}
