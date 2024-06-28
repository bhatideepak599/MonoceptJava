package com.techlabs.creational.factory.model;

public class CurrentAccount implements IAccount {
	
	private String accountNumber;
	private double balance;
	private double overDraftLimit;
	
	private double limit;
	
	public CurrentAccount(String accountNumber, double balance, double overDraftLimit) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.overDraftLimit = overDraftLimit;
		limit=overDraftLimit;
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

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}

	@Override
	public void credit(double amount) {
		if(limit>overDraftLimit) {
			if(amount < (limit-overDraftLimit)) {
				overDraftLimit+=amount;
				amount=0;
			}
			else if(amount > (limit-overDraftLimit)) {
				amount-=(limit-overDraftLimit);
				overDraftLimit=limit;
			}
		}
		balance+=amount;
		System.out.println("Amount Credited Successfully into Current Account.");
		System.out.println("Current Balance is "+ balance +"\nOverDraft limit is "+overDraftLimit);
		

	}
	

	@Override
	public String toString() {
		return "CurrentAccount [AccountNumber=" + accountNumber + ", Balance=" + balance + ", overDraftLimit="
				+ overDraftLimit + "]";
	}

	@Override
	public void debit(double amount) {
		if(balance +overDraftLimit >=amount) {
			System.out.println("Amount Debited Successfully from Current Account.");
			if(balance>=amount) {
				balance-=amount;
				System.out.println("Current Balance is "+ balance);
				return;
			}
			
			overDraftLimit+= balance-amount ; 
			balance=0;
			System.out.println("Current Balance = 0 \nOver Draft limit = "+overDraftLimit );
			return;
			
		}
		System.out.println("Insufficient Balance.");

	}

}
