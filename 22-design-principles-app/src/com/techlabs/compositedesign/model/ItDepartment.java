package com.techlabs.compositedesign.model;

public class ItDepartment implements Department{
	private String name;
	private int id;
	
	public ItDepartment(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public void printDepartmentName() {
		System.out.println(getClass().getSimpleName());
	}

}
