package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		List<Account> accounts=new ArrayList<Account>();
		System.out.println("Enter The Numbers of Account: ");
		int size=scanner.nextInt();
		
		while(size>0) {
			size--;
			System.out.print("Enter Account Number: ");
			int accountNumber=scanner.nextInt();
			System.out.print("Enter Account Holder's Name: ");
			String name=scanner.next();
			System.out.print("Enter Account Number: ");
			double balance=scanner.nextDouble();
			accounts.add(new Account(accountNumber,name,balance));
		} 
		int choice; 
		
		do {
			display();
			 choice=scanner.nextInt();
			switch (choice) {
		    
			case 1:
					minimumBalance();
		        break;
		    
			case 2:
		    	maximumBalance();
		        break;
		    
			case 3:
		    	
				namesGreaterThan6();
		        break;
			
			case 4:
				totalBalanceOfAllAccount();
				break;
		        
		    case 5:
		        System.out.println("Exiting...");
		        scanner.close();
		        break;
		    default:
		        System.out.println("Invalid choice. Please try again.");
		}
				
		}
		while(choice!=5);
		

	}
	private static void totalBalanceOfAllAccount() {
		// TODO Auto-generated method stub
		
	}
	private static void namesGreaterThan6() {
		// TODO Auto-generated method stub
		
	}
	private static void maximumBalance() {
		// TODO Auto-generated method stub
		
	}
	private static void minimumBalance() {
		// TODO Auto-generated method stub
		
	}
	public static  void  display() {
		System.out.println("1. Show Account details of account with minimum Balance. "
				+ "\n2. Show Account details of account with maximum Balance. "
				+ "\n3. Show names greater than 6 character."
				+ "\n4. Find total of balance of all accounts"
				+ "\n5. Exit");
	}

}
