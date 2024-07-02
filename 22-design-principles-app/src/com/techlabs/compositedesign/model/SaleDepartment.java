package com.techlabs.compositedesign.model;

public class SaleDepartment implements Department{
	private String name;
	private int id;
	
	public SaleDepartment(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public void printDepartmentName() {
		System.out.println(getClass().getSimpleName());
		
	}

}
