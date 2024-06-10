package com.techlabs.exception;

public class NegativeAmountException extends Exception {
	
	public String getMessage() {
		return "Invalid debit amount";
	}
}
