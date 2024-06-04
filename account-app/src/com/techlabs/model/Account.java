package com.techlabs.model;

public class Account {
	
	private String accountNumber;
	private String name;
	private double balance;
	
	public Account() {
		
		this.accountNumber = null;
		this.name = null;
		this.balance = 0;
	}
	
	
	public Account(String accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void credit(double amount) {
		 if (amount > 0) {
			 this.balance+= amount;
	            System.out.println("Amount credited successfully!");
	        } else {
	            System.out.println("Invalid credit amount!");
	        }
		
	}
	public void debit(double amount) {
		
		
            this.balance -= amount;
            System.out.println("Amount debited successfully!");
        
		
	}
	@Override
	public String toString() {
		return "Account [AccountNumber=" + accountNumber + ", Name=" + name + ", Balance=" + balance + "]";
	}
	
	
}
