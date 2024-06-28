package com.techlabs.creational.factory.model;

import java.util.Scanner;

public class AccountFactory {
	private static IAccount iaccount;
	
	public static IAccount getAccount(String account) {
		 if(account=="Savings") {
			 Scanner scanner=new Scanner(System.in);
			 System.out.print("Enter AccountHolder's Name :");
			 String name=scanner.next();
			 System.out.print("Enter AccountNumber :");
			 String accountNumber=scanner.next();
			 System.out.print("Enter Account Balance :");
			 double balance=scanner.nextDouble();
			 iaccount=new SavingsAccount(name,accountNumber,balance);
		 }
		 if(account=="Current") {
			 Scanner scanner=new Scanner(System.in);
			
			 System.out.print("Enter AccountNumber :");
			 String accountNumber=scanner.next();
			 System.out.print("Enter Account Balance :");
			 double balance=scanner.nextDouble();
			 System.out.print("Enter overDraftLimit :");
			 double overDraftLimit=scanner.nextDouble();
			 iaccount=new CurrentAccount(accountNumber,balance,overDraftLimit);
		 }
		 return iaccount;
		 
	}
}
