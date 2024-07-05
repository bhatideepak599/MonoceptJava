package com.techlabs.composite.test;

import com.techlabs.composite.model.Developer;
import com.techlabs.composite.model.EmployeeDirectory;
import com.techlabs.composite.model.IEmployee;
import com.techlabs.composite.model.Manager;

public class EmployeeDirectoryTest {

	public static void main(String[] args) {
		
		IEmployee dev1 = new Developer(1, "Deepak", "SDE1");
		IEmployee dev2 = new Developer(2, "Rahul", "SDE2");
		EmployeeDirectory devDirectory = new EmployeeDirectory();
		
		devDirectory.addEmployee(dev1);
		devDirectory.addEmployee(dev2);

		IEmployee manager1 = new Manager(101, "SAM", "AWS Manager");
		IEmployee manager2 = new Manager(102, "DILIP", "DotNet Manager");
		EmployeeDirectory managerDirectory = new EmployeeDirectory();
		managerDirectory.addEmployee(manager1);
		managerDirectory.addEmployee(manager2);

		EmployeeDirectory companyDirectory = new EmployeeDirectory();
		companyDirectory.addEmployee(devDirectory);
		companyDirectory.addEmployee(managerDirectory);

		companyDirectory.showEmployesDetails();

	}
}
