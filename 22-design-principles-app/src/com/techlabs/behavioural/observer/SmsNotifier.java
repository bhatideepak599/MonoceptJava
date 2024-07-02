package com.techlabs.behavioural.observer;

public class SmsNotifier implements INotifier {
	 private static SmsNotifier smsNotifier;

	    private SmsNotifier(){}

	    public static SmsNotifier getInstance(){
	        if(smsNotifier==null)
	            smsNotifier=new SmsNotifier();
	        return smsNotifier;
	    }

	@Override
	public void notifyUser(Account account, String transType, double amount) {
		System.out.println(transType+" transaction of amount : "+amount);
        System.out.println("SMS Notification for Account number : "+account.getAccountNumber());
        System.out.println("Current Account Balance : "+account.getBalance());
        System.out.println("------------------------------------------------------------------------");
	}

}
