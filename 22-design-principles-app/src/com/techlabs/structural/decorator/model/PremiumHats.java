package com.techlabs.structural.decorator.model;

public class PremiumHats implements IHat {
	
	@Override
	public String getName() {
		
		return "Premium hats";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 300;
	}

	@Override
	public String getDescription() {
		
		return "Its a Premium hat ";
	}

}
