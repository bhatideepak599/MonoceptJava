package com.techlabs.creational.factory.model;

public class SavingsAccount implements IAccount {
	
	private String name;
	private String accountNumber;
	private double balance;
	
	

	public SavingsAccount(String name, String accountNumber, double balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	@Override
	public void credit(double amount) {
		balance+=amount;
		System.out.println("Amount Credited Successfully into Savings Account.");
		System.out.println("Current Balance is "+ balance);

	}

	
	@Override
	public void debit(double amount) {
		if(balance>=amount) {
			balance-=amount;
			System.out.println("Amount Debited Successfully from Savings Account.");
			System.out.println("Current Balance is "+ balance);
			return;
		}
		System.out.println("Insufficient Balance.");

	}
	@Override
	public String toString() {
		return "SavingsAccount [Name=" + name + ", accountNumber=" + accountNumber + ", Balance=" + balance + "]";
	}




}
