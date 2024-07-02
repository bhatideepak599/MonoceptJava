package com.techlabs.structural.decorator.model;

public class StandardHats implements IHat {

	@Override
	public String getName() {
		
		return "Standard hat";
	}

	@Override
	public double getPrice() {
		
		return 100;
	}

	@Override
	public String getDescription() {
		
		return "Its a Standard hat ";
	}

}
