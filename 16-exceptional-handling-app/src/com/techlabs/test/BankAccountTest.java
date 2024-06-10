package com.techlabs.test;

import com.techlabs.exception.InsufficientFundsException;
import com.techlabs.exception.NegativeAmountException;
import com.techlabs.model.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		
		try {
			BankAccount bankAccount1=new BankAccount("Deepak", "12345", 50000);
			bankAccount1.debit(1000);
		}
		catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		catch(NegativeAmountException e) {
			System.out.println(e.getMessage());
		}

	}

}
