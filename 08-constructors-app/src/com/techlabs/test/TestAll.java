package com.techlabs.test;

import com.techlabs.model.Account;
import com.techlabs.model.Employee;
import com.techlabs.model.Student;

public class TestAll {

	public static void main(String[] args) {
		Student student1=new Student(25581,"Deepak",22);
		
		System.out.println("Name :"+student1.getName());
		System.out.println("Age :"+student1.getAge());
		System.out.println("Roll No :"+student1.getRollno());
		
		System.out.println();
		System.out.println("Employee Details :");
		Employee employee1=new Employee("Deepak","I000070",20000);
		System.out.println("Name :"+employee1.getName());
		System.out.println("Id :"+employee1.getId());
		System.out.println("Salary :"+employee1.getSalary());
		
		System.out.println();
		System.out.println("Account Details :");
		
		Account account1=new Account("Deepak","12344555","Savings",500000);
		System.out.println("Name :"+account1.getName());
		System.out.println("Account Number :"+account1.getAccountNumber());
		System.out.println("Account Type :"+account1.getAccountType());
		System.out.println("Available Balance :"+account1.getBalance());

	}

}
