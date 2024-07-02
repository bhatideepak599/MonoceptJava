package com.techlabs.compositedesign.model;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {
	
	private String name;
	private int id;
	private List<Department> childDepartment;
	
	public HeadDepartment(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		this.childDepartment=new ArrayList<>();
	}
	public void addDepartment(Department department) {
		childDepartment.add(department);
	}
	public void removeDepartment(Department department) {
		childDepartment.remove(department);
	}
	
	
	@Override
	public void printDepartmentName() {
		childDepartment.forEach(Department:: printDepartmentName);
		
	}

}
