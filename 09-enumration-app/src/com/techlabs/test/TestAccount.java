package com.techlabs.test;

import com.techlabs.model.Account;
import com.techlabs.model.AccountType;

public class TestAccount {

	public static void main(String[] args) {
		Account account=new Account("Deepak","1234",AccountType.savings,1000000);
		
		System.out.println(account);

	}

}
