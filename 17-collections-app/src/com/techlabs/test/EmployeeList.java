package com.techlabs.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.techlabs.model.Employee;

public class EmployeeList {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<Employee>();
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of employees:");
		int size=scanner.nextInt();
		
		for(int i=0;i<size;i++) {
			System.out.print("Enter Employee Id:");
			int id=scanner.nextInt();
			

			System.out.print("Enter Employee Name:");
			String name=scanner.next();
			

			System.out.print("Enter Employee Salary:");
			double salary=scanner.nextDouble();
			
			employees.add(new Employee(id, name, salary));
		}
		
		for(int i=0;i<size;i++) {
			System.out.println(employees.get(i));
		}
		System.out.println("2nd way");
		Iterator employeeIterator=employees.iterator();
		while(employeeIterator.hasNext()) {
			System.out.println(employeeIterator.next());
		}
		
		ListIterator lstItr=employees.listIterator();
		System.out.println("3rd way");
		
		while(lstItr.hasNext()) {
			System.out.println(lstItr.next());
		}
		while(lstItr.hasPrevious()) {
			System.out.println(lstItr.previous());
		}
		
		
		
		//System.out.println(employees);
	}

}
