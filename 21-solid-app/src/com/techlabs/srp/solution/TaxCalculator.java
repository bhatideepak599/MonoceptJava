package com.techlabs.srp.solution;

public class TaxCalculator {
	private double taxRate;

	public TaxCalculator(double taxRate) {
		super();
		this.taxRate = taxRate;
	}
	
	public void calculateTax(Invoice invoice) {
		invoice.setTax(invoice.getAmount()* taxRate /100);
	}
	
}
