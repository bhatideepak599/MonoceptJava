package com.techlabs.exception;

public class NoSuchMovieFoundException extends Exception {
	public NoSuchMovieFoundException(String s){
		System.out.println(s);
	}
	public String getMessage() {
		return "No Such Movie Found...";
	}
}
