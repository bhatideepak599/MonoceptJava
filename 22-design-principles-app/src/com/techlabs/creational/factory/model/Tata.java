package com.techlabs.creational.factory.model;

public class Tata implements ICar {

	@Override
	public void start() {
		System.out.println("Tata has Started.");

	}

	@Override
	public void stops() {
		System.out.println("Tata has Stopped.");

	}

}
