package com.techlabs.structural.decorator.model;

public class OilChange extends CarServiceDecorator {

	public OilChange(ICarService iCarService) {
		super(iCarService);

	}

	@Override
	public double getCost() {

		return 500 + super.getCost();
	}

}
