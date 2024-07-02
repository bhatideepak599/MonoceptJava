package com.techlabs.structural.decorator.model;

public abstract class CarServiceDecorator implements ICarService {
	private ICarService iCarService;

	public CarServiceDecorator(ICarService iCarService) {
		super();
		this.iCarService = iCarService;
	}

	public ICarService getICarService() {
		return iCarService;
	}

	@Override
	public double getCost() {

		return iCarService.getCost();
	}

}
