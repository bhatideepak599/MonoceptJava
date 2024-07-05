package com.techlabs.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String name;
	private int accountNumber;
	private double balance;
	
	private List<INotifier> notifiers;
	

	public Account(String name, int accountNumber, double balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.notifiers=new ArrayList<INotifier>();
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void debit(double amount) {
		if(balance>=amount) {
			balance-=amount;
			for(INotifier notifier1: notifiers) {
				notifier1.notifyUser(this,"debit",amount);
			}
			
		}
	}

	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			for(INotifier notifier1: notifiers) {
				notifier1.notifyUser(this,"Credit",amount);
			}
		}
	}
	public void registerUser(INotifier notifier)  {
		if(notifiers.contains(notifier) ) throw new NotifierAlreadyPresent();
			notifiers.add(notifier);
	}
	


	@Override
	public String toString() {
		return "Account [Name=" + name + ", AccountNumber=" + accountNumber + ", Account Balance=" + balance + "]";
	}
	
	
	
}
