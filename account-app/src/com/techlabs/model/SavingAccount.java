package com.techlabs.model;

public class SavingAccount extends Account {
	private  double minBalance = 1000;
	
	
	public SavingAccount() {
		super();
		
	}
	public SavingAccount(String accountNumber, String name, double balance) {
		
		super(accountNumber,name,balance);
		
		if (getBalance() >= minBalance) {
            System.out.println("Savings account created Successfully!");
            
        }
		else if(getBalance() < minBalance) {
			 System.out.println("Savings account creation failed! Minimum balance required: " + minBalance);
		}
	
		
	}
	@Override
	public void debit(double amount) {
		if(amount>0 &&getBalance()-amount>=minBalance)
			super.debit(amount);
		else System.out.println("Insufficient balance! Minimum balance needs to be maintained.");
	}
	@Override
	public String toString() {
		return "SavingAccount [ Name=" + getName()+", Balance=" + getBalance() + ","+ " AccountNumber="
				+ getAccountNumber()  +  "]";
	}
	
	
	
	
}
