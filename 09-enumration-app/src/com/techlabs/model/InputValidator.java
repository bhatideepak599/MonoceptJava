package com.techlabs.model;

public class InputValidator {
	
	public  boolean checkUsername(String userName) {
		return checkValidation(userName,3,20);
	}
	
	public boolean checkPassword(String password) {
		return checkValidation(password,8,30);
		}
	
	public  boolean checkEmail(String email) {
		if( !checkValidation(email,5,50)) return false;
		
		if(!email.contains("@") || !email.contains(".") ) return false;
		
		return true;
		}
	 private boolean checkValidation(String input,int minLength,int maxLength) {
		 if(input==null || input.length()<minLength|| input.length()>maxLength)
			 return false;
		 return true;
	 }
}
