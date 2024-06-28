package com.techlabs.abstractfactory.model;

public class MarutiFactory implements ICarFactory {
	
	
	@Override
	public  ICars makeCar() {
		
		return new Maruti();
	}

}
