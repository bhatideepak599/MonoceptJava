package com.techlabs.exception;

public class AgeNotValidException extends RuntimeException {
	
	public String getMessage() {
		
		return "Age is Invalid";
	}
}
