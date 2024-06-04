package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.CurrentAccount;
import com.techlabs.model.SavingAccount;

public class TestAccounts {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Select Account Type: \n 1.Saving \n 2.Current \n 3.Exit:");
		int choice;
		System.out.print("Enter Your Choice:");
		choice=scanner.nextInt();
		
		if(choice==1) {
			
			System.out.println("You Choose Savings Account.");
			SavingAccount savingAccount=new SavingAccount();
			selectOperationForSavings(scanner,savingAccount);
			
		}
		if(choice==2) {
			System.out.println("You Choose Current Account.");
			CurrentAccount currentAccount=new CurrentAccount();
			selectOperationForCurrent(scanner,currentAccount);
			
		}
		
		
	}

	private static void selectOperationForSavings(Scanner scanner,SavingAccount savingAccount) {
		System.out.println("Select Operation:");
		System.out.println("1. Create Account \n2. Display Account Details \n3. Credit into Account \n4. Debit from Account \n5. Exit");
		int choice;
		System.out.print("Enter Your Choice: ");
		choice=scanner.nextInt();
		while(choice!=5) {
			
			if(choice==1) {
				System.out.print(" You Selected Creating a New Account. \n Please enter the details: \n Enter Account Number:");
				String accountNumber=scanner.next();
				savingAccount.setAccountNumber(accountNumber);
				System.out.print("Enter Account Holder's Name:");
				String name=scanner.next();
				savingAccount.setName(name);
				
				System.out.println("Enter Opening Balance:");
				double balance=scanner.nextDouble();
				savingAccount.setBalance(balance);
				System.out.println("Your Account is Created.");
				
			}
			if(choice==2) {
				System.out.println("You Select Display account Details.");
				System.out.println(savingAccount);
			}
			if(choice==3) {
				System.out.println("You Select Crediting into Account.");
				System.out.println("Enter The Amount");
				double amount=scanner.nextDouble();
				savingAccount.credit(amount);
				System.out.println("Your Balance is "+savingAccount.getBalance());
			}
			if(choice==4) {
				System.out.println("You Select Debiting from Account.");
				System.out.println("Enter The Amount");
				double amount=scanner.nextDouble();
				savingAccount.debit(amount);
				System.out.println("Your Balance is "+savingAccount.getBalance());
				
			}
			if(choice==5) break;
			
			System.out.println("Select Operation:");
			System.out.println("1. Create Account \n2. Display Account Details \n3. Credit into Account \n4. Debit from Account \n5. Exit");
			
			System.out.print("Enter Your Choice: ");
			choice=scanner.nextInt();
			
		}
	}

private static void selectOperationForCurrent(Scanner scanner,CurrentAccount currentAccount) {
	System.out.println("Select Operation:");
	System.out.println("1. Create Account \n2. Display Account Details \n3. Credit into Account \n4. Debit from Account \n5. Exit");
	int choice;
	System.out.print("Enter Your Choice: ");
	choice=scanner.nextInt();
	while(choice!=5) {
		
		if(choice==1) {
			System.out.print("You Selected Creating a New Account. \n Please enter the details: \n Enter Account Number:");
			String accountNumber=scanner.next();
			currentAccount.setAccountNumber(accountNumber);
			System.out.print("Enter Account Holder's Name:");
			String name=scanner.next();
			currentAccount.setName(name);
			
			System.out.println("Enter Opening Balance:");
			double balance=scanner.nextDouble();
			currentAccount.setBalance(balance);
			System.out.println("Your Account is Created.");
			
		}
		if(choice==2) {
			System.out.println("You Select Display account Details.");
			System.out.println(currentAccount);
		}
		if(choice==3) {
			System.out.println("You Select Crediting into Account.");
			System.out.println("Enter The Amount");
			double amount=scanner.nextDouble();
			currentAccount.credit(amount);
			System.out.println("Your Balance is "+currentAccount.getBalance());
		}
		if(choice==4) {
			System.out.println("You Select Debiting from Account.");
			System.out.println("Enter The Amount");
			double amount=scanner.nextDouble();
			currentAccount.debit(amount);
			if(currentAccount.getBalance()<0) {
				
				System.out.println("Balance is 0.0");
				System.out.println("over draft limit is "+ (2500+currentAccount.getBalance()));
			}
			if(currentAccount.getBalance()>0)
			System.out.println("Your Balance is "+currentAccount.getBalance());
			
		}
		if(choice==5) break;
		
		System.out.println("Select Operation:");
		System.out.println("1. Create Account \n2. Display Account Details \n3. Credit into Account \n4. Debit from Account \n5. Exit");
		
		System.out.print("Enter Your Choice: ");
		choice=scanner.nextInt();
		
	}
}
}