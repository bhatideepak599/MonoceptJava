package com.techlabs.structural.adapter.model;

public class Hat {
	private String shortName;
	private String longname;
	private double basePrice;
	private double taxPrice;
	public Hat(String shortName, String longname, double basePrice, double taxrate) {
		super();
		this.shortName = shortName;
		this.longname = longname;
		this.basePrice = basePrice;
		this.taxPrice = taxrate;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getLongname() {
		return longname;
	}
	public void setLongname(String longname) {
		this.longname = longname;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public double getTaxPrice() {
		return taxPrice;
	}
	public void setTaxPrice(double taxrate) {
		this.taxPrice = taxrate;
	}
	
	
}
