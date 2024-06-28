package com.techlabs.dip.violation;

public class TaxCalculator {

	DBLogger dbLogger;
	public void calculateTax(int amount,int rate) {
		int tax=0;
		try {
			tax=amount/rate;
			System.out.println("Tax is "+tax);
		}
		catch(Exception e) {
			new DBLogger().log("Divide by Zero");
		}
	}
}
