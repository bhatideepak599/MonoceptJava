package com.techlabs.creational.singleton.model;

public class Login {
	private static Login login;
	private Login() {
		
	}
	
	public static Login getLogin() {
		if(login==null)
			login=new Login();//lazily loading means loading on demand
		return login;
	}
	
	public String getMessage() {
		return "Logged in Successfully.";
	}
}
