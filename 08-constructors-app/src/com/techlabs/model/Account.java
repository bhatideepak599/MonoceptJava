package com.techlabs.model;

public class Account {
	private String name;
	private String account_number;
	private String account_type;
	private double balance;
	
	public Account() {
		 name="";
		 account_number="";
		 account_type="";
		 balance=0;
	}
	public Account(String name1,String accountNumber,String type,double balance1) {
		 name=name1;
		 account_number=accountNumber;
		 account_type=type;
		 balance=balance1;
	}
	
	public void setName(String name1) {
		 name=name1;
	}
	public String getName() {
		 return name;
	}
	public void setAccountNumber(String accountNumber) {
		account_number=accountNumber;
	}
	public String getAccountNumber() {
		 return account_number;
	}
	public void setAccountType(String type) {
		account_type=type;
	}
	public String getAccountType() {
		 return account_type;
	}
	
	public void setBalance(double balance1) {
		 balance=balance1;
	}
	public double getBalance() {
		return balance;
	}
}
