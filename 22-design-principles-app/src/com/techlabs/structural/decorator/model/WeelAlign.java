package com.techlabs.structural.decorator.model;

public class WeelAlign extends CarServiceDecorator {

	public WeelAlign(ICarService iCarService) {
		super(iCarService);

	}

	@Override
	public double getCost() {

		return 400 + super.getCost();
	}

}
