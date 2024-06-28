package com.techlabs.creational.factory.model;

public class Maruti implements ICar {

	@Override
	public void start() {
		System.out.println("Maruti has Started.");

	}

	@Override
	public void stops() {
		System.out.println("Maruti has Stopped.");

	}

}
