package com.techlabs.model;

import com.techlabs.exception.InsufficientFundsException;
import com.techlabs.exception.NegativeAmountException;

public class BankAccount {
	private String name;
	private String accountNumber;
	private double balance;
	public BankAccount(String name, String accountNumber, double balance) {
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
	
	public void debit(double amount) throws InsufficientFundsException, NegativeAmountException {
		if(amount>balance) 
			throw new InsufficientFundsException();
		if(amount<0)
			throw new NegativeAmountException();
		this.balance-=amount;
		System.out.println("Amount Debited Successfully.");
		
	}
	
	public void credit(double amount) throws NegativeAmountException  {
		if(amount<0) 
			throw new NegativeAmountException();
		this.balance+=amount;
		System.out.println("Amount Credited Successfully.");
		
	}

	@Override
	public String toString() {
		return "BankAccount [Name=" + name + ", AccountNumber=" + accountNumber + ", Balance=" + balance + "]";
	}
	
	
	
	
	
}
