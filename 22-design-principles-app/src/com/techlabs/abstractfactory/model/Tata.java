package com.techlabs.abstractfactory.model;

public class Tata implements ICars {

	@Override
	public void start() {
		System.out.println("Tata has Started.");

	}

	@Override
	public void stops() {
		System.out.println("Tata has Stopped.");

	}

}
