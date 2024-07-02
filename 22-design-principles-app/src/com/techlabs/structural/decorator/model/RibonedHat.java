package com.techlabs.structural.decorator.model;

public class RibonedHat extends HatDecorator {

	public RibonedHat(IHat hat) {
		super(hat);
		
	}

	@Override
	public String getName() {
		
		return hat.getName()+" and Riboned Hat";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 50+hat.getPrice();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return hat.getDescription()  +" and its has Ribbons";
	}

}
