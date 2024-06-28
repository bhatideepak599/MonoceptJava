package com.techlabs.test;

import com.techlabs.srp.solution.Invoice;
import com.techlabs.srp.solution.InvoicePrint;
import com.techlabs.srp.solution.TaxCalculator;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice=new Invoice(1,"Fridge",22000);
		TaxCalculator taxCalculator=new TaxCalculator(10);
		taxCalculator.calculateTax(invoice);
		
		InvoicePrint invoiceprint=new InvoicePrint();
		invoiceprint.printInvoice(invoice);
		

	}

}
