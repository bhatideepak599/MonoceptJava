package com.techlabs.dip.test;

import com.techlabs.dip.violation.TaxCalculator;

public class CalculateTax {

	public static void main(String[] args) {
		TaxCalculator t1=new TaxCalculator();
		t1.calculateTax(1000, 10);
		TaxCalculator t2=new TaxCalculator();
		t2.calculateTax(2000, 0);

	}

}
