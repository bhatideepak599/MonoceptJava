package com.techlabs.model;

import java.util.Date;

public class Insurancepolicy {
	private int policyNumber;
	private String policyHolderName;
	private double policyAmount;
	private Date policyCreationDate;
	public Insurancepolicy(int policyNumber, String policyHolderName, double policyAmount,Date policyCreationDate) {
		super();
		this.policyNumber = policyNumber;
		this.policyAmount=policyAmount;
		this.policyHolderName = policyHolderName;
		this.policyCreationDate = policyCreationDate;
	}
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public double getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(int policyAmount) {
		this.policyAmount = policyAmount;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public Date getPolicyCreationDate() {
		return policyCreationDate;
	}
	public void setPolicyCreationDate(Date policyCreationDate) {
		this.policyCreationDate = policyCreationDate;
	}
	@Override
	public String toString() {
		return " [PolicyNumber=" + policyNumber + ", PolicyHolderName=" + policyHolderName
				+ ", PolicyAmount=" + policyAmount + ", PolicyCreationDate=" + policyCreationDate + "]";
	}
	
	
	
	
}
