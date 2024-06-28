package com.techlabs.abstractfactory.model;

public class Maruti implements ICars {

	@Override
	public void start() {
		System.out.println("Maruti has Started.");

	}

	@Override
	public void stops() {
		System.out.println("Maruti has Stopped.");

	}

}
