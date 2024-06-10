package com.techlabs.exception;

public class CapacityFullException extends Exception {
	
	public String getMessage() {
		return "Movie list is full.";
	}

}
