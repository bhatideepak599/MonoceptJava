package com.techlabs.test;

import java.util.Scanner;
import java.util.function.Predicate;

public class EmailValidator {

	public static void main(String[] args) {
		Predicate<String> emailValidator=(email)->{
			if(email.length()>5 && email.charAt(0)!='@' && email.charAt(0)!= '.' && email.contains("@") && email.contains(".") ) return false;
			return true;
		};
		System.out.print("Enter The Email Id:");
		String email=new Scanner(System.in).next();
		if(emailValidator.test(email)) {
			System.out.println("InValid Email.");
			System.exit(0);
			
		}
		System.out.println("Valid EmailId");

	}

}
