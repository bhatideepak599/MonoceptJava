package com.techlabs.model;

import java.util.Date;

public class Transaction {
	private String transactionId;
    private String productId;
    private String type; // "add" or "remove"
    private int quantity;
    private Date date;
    
	public Transaction(String transactionId, String productId, String type, int quantity, Date date) {
		super();
		this.transactionId = transactionId;
		this.productId = productId;
		this.type = type;
		this.quantity = quantity;
		this.date = date;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	@Override
	public String toString() {
		return "Transaction [TransactionId=" + transactionId + ", ProductId=" + productId + ", Type=" + type
				+ ", Quantity=" + quantity + ", Date=" + date + "]";
	}

	public String toFileFormat() {
        return String.join(",", transactionId, productId, type, String.valueOf(quantity), String.valueOf(date.getTime()));
    }

    public static Transaction fromFileFormat(String fileFormat) {
        String[] fields = fileFormat.split(",");
        return new Transaction(fields[0], fields[1], fields[2], Integer.parseInt(fields[3]), new Date(Long.parseLong(fields[4])));
    }
	
    
}
