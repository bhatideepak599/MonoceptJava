package com.techlabs.test;

import com.techlabs.model.Account;

public class TestAccount {

	public static void main(String[] args) {
		
		Account account1=new Account("Deepak","1234",51000);
		System.out.println(account1);
		Account account2 =new Account("abc","1231",50000);
		System.out.println(account2);
		Account account3=new Account("xyz","1243",15000);
		System.out.println(account3);
		
		System.out.println("Total account created : " +account3.getAccountsCount());
		

	}

}
