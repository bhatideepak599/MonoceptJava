package com.techlabs.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


import com.techlabs.model.Insurancepolicy;
import com.techlabs.model.Policycomparator;


public class PolicyList {

	public static void main(String[] args) {
		List<Insurancepolicy> policies=new ArrayList<Insurancepolicy>();
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of Policies:");
		int size=scanner.nextInt();
		System.out.println("Enter Details of Policy:");
		for(int i=0;i<size;i++) {
			System.out.print("Enter Policy number:");
			int policyNumber=scanner.nextInt();
			

			System.out.print("Enter Policy Holder's Name:");
			String name=scanner.next();
			System.out.print("Enter Policy Amount:");
			double amount=scanner.nextDouble();

			System.out.println("Enter Policy Creation Date:");
			System.out.print("Date:");
			int date=scanner.nextInt();
			System.out.print("Month:");
			int month=scanner.nextInt();
			System.out.print("Year:");
			int year=scanner.nextInt();
			
			Date date1=new Date(year,month,date);
			
			policies.add(new Insurancepolicy(policyNumber, name,amount, date1));
		}
		
		int choice;
	
		do {
				displayMenu();
				choice=scanner.nextInt();
				
				switch (choice) {
			    
				case 1:
			        Collections.sort(policies, new Policycomparator.PolicyByName());
			        System.out.println(policies);
			        break;
			    
				case 2:
					Collections.sort(policies, new Policycomparator.PolicyByAmount());
					System.out.println(policies);
			        break;
			    
				case 3:
					Collections.sort(policies, new Policycomparator.PolicyByCreationDate());
					System.out.println(policies);
			        break;
			        
			    case 4:
			        System.out.println("Exiting...");
			        scanner.close();
			        break;
			    default:
			        System.out.println("Invalid choice. Please try again.");
			}
	   
			}
			while(choice!=4);
		

	}

	private static void displayMenu() {
		System.out.println("1. Sort by Name. \n2. Sort by Amount. \n3. Sort by Creation Date. \n4. Exit");
		System.out.print("Enter Your choice:");
		
	}

}
