package com.techlabs.abstractfactory.model;

public class Mahindra implements ICars {

	@Override
	public void start() {
		System.out.println("Mahindra has Started.");

	}

	@Override
	public void stops() {
		System.out.println("Mahindra has Stopped.");

	}

}
