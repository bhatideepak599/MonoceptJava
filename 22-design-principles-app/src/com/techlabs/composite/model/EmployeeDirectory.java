package com.techlabs.composite.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory implements IEmployee {
	
	private List<IEmployee> employees;
	
	public EmployeeDirectory() {
		super();
		this.employees = new ArrayList<>();
	}
	
	public void addEmployee(IEmployee employee) {
		employees.add(employee);
	}
	public void removeEmployee(IEmployee employee) {
		employees.remove(employee);
	}
	@Override
	public void showEmployesDetails() {
		for(IEmployee employee: employees) {
			employee.showEmployesDetails();
		}

	}

}
