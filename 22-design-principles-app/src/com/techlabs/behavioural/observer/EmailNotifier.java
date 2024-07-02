package com.techlabs.behavioural.observer;

public class EmailNotifier implements INotifier {
	
	private static EmailNotifier emailNotifier;
	private  EmailNotifier() {
		
	}
	public static EmailNotifier getInstance() {
		if(emailNotifier==null) emailNotifier=new EmailNotifier();
		return emailNotifier;
	}
	@Override
	public void notifyUser(Account account, String transaction, double amount) {
		

	        System.out.println(transaction+" transaction of amount : "+amount);
	        System.out.println("Email Notification for Account number : "+account.getAccountNumber());
	        System.out.println("Current Account Balance : "+account.getBalance());
	        System.out.println("------------------------------------------------------------------------");
	}

}
