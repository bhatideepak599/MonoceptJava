package com.techlabs.model;

public class ConstructorClass {
	String name;

	public ConstructorClass(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "ConstructorClass [Name=" + name + "]";
	}
	
	
}
