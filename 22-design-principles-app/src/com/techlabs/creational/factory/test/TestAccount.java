package com.techlabs.creational.factory.test;

import java.util.Scanner;

import com.techlabs.creational.factory.model.AccountFactory;
import com.techlabs.creational.factory.model.IAccount;

public class TestAccount {

	public static void main(String[] args) {
		IAccount iaccount = null;
		int choice;
		Scanner scanner=new Scanner(System.in);
			do {
				
				System.out.println("Select Account Type: \n 1.Saving \n 2.Current \n 3.Exit:");
				System.out.print("Enter Your Choice: ");
				choice=scanner.nextInt();
				
				switch (choice) {
			    
				case 1:
					display(iaccount,scanner,"Savings");
					break;
					
				case 2:
					display(iaccount,scanner,"Current");
					
			        break;
			    
				case 3:
			        System.out.println("Exiting...");
			       
			        break;
			    default:
			        System.out.println("Invalid choice. Please try again.");
			}
	   
			}
			while(choice!=3);

	}
	
	public static void display(IAccount iaccount, Scanner scanner,String accountType) {
		
		int operation;
		do {
	        System.out.println("Select Operations: \n1. Create Account. \n2. Display Account Details. \n3. Debit. \n4. Credit. \n5. Exit.");
	        System.out.print("Enter Your Choice: ");
	        
	        operation = scanner.nextInt();
	        
	        switch (operation) {
	            case 1:
	                iaccount = AccountFactory.getAccount(accountType);
	                break;
	                
	            case 2:
	                if (iaccount != null) {
	                    System.out.println(iaccount);
	                    break;
	                } 
	                    System.out.println("No account exists. Please create an account first.");
	                
	                break;
	                
	            case 3:
	                if (iaccount != null) {
	                    System.out.print("Enter The Amount to Debit: ");
	                    double amount = scanner.nextDouble();
	                    iaccount.debit(amount);
	                    break;
	                } 
	                    System.out.println("No account exists. Please create an account first.");
	                
	                break;
	                
	            case 4:
	                if (iaccount != null) {
	                    System.out.print("Enter The Amount to Credit: ");
	                    double amount = scanner.nextDouble();
	                    iaccount.credit(amount);
	                    break;
	                } 
	                    System.out.println("No account exists. Please create an account first.");
	                
	                break;
	                
	            case 5:
	                System.out.println("Exiting...");
	                break;
	               
	                
	            default:
	                System.out.println("Invalid choice. Please try again.");
	        }
	    } while (operation != 5);
			
		}
	}
