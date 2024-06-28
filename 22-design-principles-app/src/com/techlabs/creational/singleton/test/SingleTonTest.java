package com.techlabs.creational.singleton.test;

import com.techlabs.creational.singleton.model.DatabaseManager;
import com.techlabs.creational.singleton.model.Login;

public class SingleTonTest {

	public static void main(String[] args) {
		Login login1=Login.getLogin();
		Login login2=Login.getLogin();
		
		DatabaseManager databaseManager=DatabaseManager.getDatabaseManager();
		
		
		
		System.out.println(login1.getMessage());
		System.out.println(login1.hashCode());
		System.out.println(login2.hashCode());
		System.out.println(databaseManager.getMessage());
		

	}

}
