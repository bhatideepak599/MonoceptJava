package com.techlabs.structural.adapter.model;

import java.util.List;

public class ShoppingCart {
	private List<IItems> items;

	public ShoppingCart(List<IItems> items) {
		super();
		this.items = items;
	}

	public List<IItems> getItems() {
		return items;
	}

	public void setItems(List<IItems> items) {
		this.items = items;
	}
	
	public void addCartItems(List<IItems> newItems) {
		for(IItems item:newItems) {
			items.add(item);
		}
	}
	public void getCartItems() {
		if(items.size()==0) {
			System.out.println("Cart is Empty, Please Add items into Cart.");
			return;
			
		}
		System.out.print("Cart Items : ");
		for(IItems item: items) {
			System.out.println(item.itemname());
		}
	}
	public double getCartPrice() {
		double sum=0;
		for(IItems item: items) {
			sum+=item.getItemPrice();
		}
		return sum;
	}
	
	public void displayItems() {
		System.out.println("Item Name                     Item Price");
		for(IItems item: items) {
			System.out.println(item.itemname()+"                        "+item.getItemPrice());
		}
		System.out.println("Total                         "+getCartPrice());
	}
}
