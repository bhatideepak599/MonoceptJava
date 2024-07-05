package com.techlabs.behavioural.observer.test;

import com.techlabs.behavioural.observer.Account;
import com.techlabs.behavioural.observer.EmailNotifier;
import com.techlabs.behavioural.observer.NotifierAlreadyPresent;
import com.techlabs.behavioural.observer.SmsNotifier;

public class TestNotifiers {

	public static void main(String[] args) {
		Account account1=new Account("Deepak",123,50000);
		try {
		account1.registerUser(EmailNotifier.getInstance());
		account1.registerUser(EmailNotifier.getInstance());
	
		account1.registerUser(SmsNotifier.getInstance());	
		
		account1.deposit(5000);
		}
		catch(NotifierAlreadyPresent e) {
			System.out.println(e.showMessage("Notifer is present."));
		}
		

	}

}
