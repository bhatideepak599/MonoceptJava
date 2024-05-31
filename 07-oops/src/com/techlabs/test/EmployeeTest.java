package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Employee;
import com.techlabs.model.Student;

public class EmployeeTest {
	
public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in); 
		Employee employee1=new Employee();
		String name,id;
		double salary;
		System.out.print("Enter The name of first Employee: ");
		name=scanner.next();
		System.out.println("Enter id :");
		id=scanner.next();
		System.out.println("Enter salary :");
		salary=scanner.nextDouble();
		employee1.init(name,id,salary);
		employee1.display();
		
		System.out.println();
		
		Employee employee2=new Employee();
		System.out.print("Enter The name of Second Employee: ");
		name=scanner.next();
		System.out.println("Enter id :");
		id=scanner.next();
		System.out.println("Enter salary :");
		salary=scanner.nextDouble();
		employee2.init(name,id,salary);
		employee2.display();

	}
	
	
}
