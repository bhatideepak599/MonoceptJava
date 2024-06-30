package com.techlabs.model;

public class Supplier {
	
	private String supplierId;
    private String name;
    private String contactInfo;
    
	public Supplier(String supplierId, String name, String contactInfo) {
		super();
		this.supplierId = supplierId;
		this.name = name;
		this.contactInfo = contactInfo;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	
	@Override
	public String toString() {
		return "Supplier [SupplierId=" + supplierId + ", Name=" + name + ", ContactInfo=" + contactInfo + "]";
	}

	public String toFileFormat() {
        return String.join(",", supplierId, name, contactInfo);
    }

    public static Supplier fromFileFormat(String fileFormat) {
        String[] fields = fileFormat.split(",");
        return new Supplier(fields[0], fields[1], fields[2]);
    }
    
	
	
    
    
}
