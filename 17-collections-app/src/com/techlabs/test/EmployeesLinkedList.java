package com.techlabs.test;

import java.util.LinkedList;
import java.util.Scanner;

import com.techlabs.model.Employee;

public class EmployeesLinkedList {

	public static void main(String[] args) {
		LinkedList<Employee> employees=new LinkedList<Employee>();
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

	}

}
