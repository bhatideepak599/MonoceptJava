package com.techlabs.exception;

public class InsufficientFundsException extends Exception {
	
	public String getMessage() {
		return "Insufficient Balance in Account";
	}
}
