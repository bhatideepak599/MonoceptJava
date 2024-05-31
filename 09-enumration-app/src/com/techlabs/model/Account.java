package com.techlabs.model;

public class Account {
	private String name;
	private String account_number;
	private AccountType account_type;
	private double balance;
	
	
	public Account() {
		
	}
	
	
	public Account(String name, String account_number, AccountType account_type, double balance) {
		super();
		this.name = name;
		this.account_number = account_number;
		this.account_type = account_type;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount_number() {
		return account_number;
	}
	
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public AccountType getAccount_type() {
		return account_type;
	}
	public void setAccount_type(AccountType account_type) {
		this.account_type = account_type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", account_number=" + account_number + ", account_type=" + account_type
				+ ", balance=" + balance + "]";
	}
	
	
}