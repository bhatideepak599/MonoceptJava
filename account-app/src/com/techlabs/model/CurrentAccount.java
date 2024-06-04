package com.techlabs.model;

public class CurrentAccount extends Account {
	private double overDraftLimit=-2500;
	
	
	public CurrentAccount() {
		super();
	}

	public CurrentAccount(String accountNumber, String name, double balance) {
		super(accountNumber,name,balance);
		
	}

	@Override
	
	public void debit(double amount) {
		if(amount >0 && getBalance() -amount>=overDraftLimit)
			super.debit(amount);
		else 
            System.out.println("Insufficient balance! Overdraft limit reached.");
        
	}

	@Override
	public String toString() {
		return "CurrentAccount [Name=" + getName()+ ", AccountNumber=" + getAccountNumber()
				+ " Balance=" + getBalance() + "]";
	}
	
	
	

	

	
}
