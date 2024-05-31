package com.techlabs.model;

public class Account {
	private String name;
	private String accountNumber;
	private double balance;
	private static int accountsCount=0;
	
	public Account(String name,String accountNumber, double balance) {
		this.name=name;
		this.accountNumber=accountNumber;
		this.balance=balance;
		accountsCount++;
		System.out.println("Account "+accountsCount+" is created");
		
	}
	public int getAccountsCount() {
		return accountsCount;
	}

	@Override
	public String toString() {
		return "Account [Name=" + name + ", AccountNumber=" + accountNumber + ", Balance=" + balance + "]";
	}
	
}
