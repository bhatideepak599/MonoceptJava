package com.techlabs.abstractfactory.model;

public class MahindraFactory implements ICarFactory {

	@Override
	public  ICars makeCar() {
		
		return new Mahindra();
	}

}
