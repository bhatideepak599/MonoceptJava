package com.techlabs.dip.solution;


public class TaxCalculator {
	ILogger ilogger;

	public TaxCalculator(ILogger ilogger) {
		super();
		this.ilogger = ilogger;
	}

	public ILogger getIlogger() {
		return ilogger;
	}

	public void setIlogger(ILogger ilogger) {
		this.ilogger = ilogger;
	}
	public void calculateTax(int amount,int rate) {
		int tax=0;
		try {
			tax=amount/rate;
			System.out.println("Tax is "+tax);
		}
		catch(Exception e) {
			ilogger.log("Divide by Zero");
		}
	}
}
