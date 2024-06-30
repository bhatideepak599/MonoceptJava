package com.techlabs.model;

public class Product {
	private String productId;
    private String name;
    private String description;
    private int quantity;
    private double price;
    
	public Product(String productId, String name, String description, int quantity, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	  public String toFileFormat() {
	        return String.join(",", productId, name, description, String.valueOf(quantity), String.valueOf(price));
	    }

	    public static Product fromFileFormat(String fileFormat) {
	        String[] fields = fileFormat.split(",");
	        return new Product(fields[0], fields[1], fields[2], Integer.parseInt(fields[3]), Double.parseDouble(fields[4]));
	    }

		@Override
		public String toString() {
			return "Product [ProductId=" + productId + ", Name=" + name + ", Description=" + description + ", Quantity="
					+ quantity + ", Price=" + price + "]";
		}
    
    
}
