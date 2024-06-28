package com.techlabs.structural.adapter.test;

import java.util.Arrays;

import com.techlabs.structural.adapter.model.Biscuit;
import com.techlabs.structural.adapter.model.Choclate;
import com.techlabs.structural.adapter.model.Hat;
import com.techlabs.structural.adapter.model.HatAdapter;
import com.techlabs.structural.adapter.model.IItems;
import com.techlabs.structural.adapter.model.ShoppingCart;

public class TestShopping {

	public static void main(String[] args) {
		IItems item1=new Biscuit("Burbon",10);
		IItems item2=new Choclate("KitKat", 30);
		Hat hat=new Hat("Short","Long",100,20);
		IItems item3=new HatAdapter(hat);
		
		ShoppingCart cart=new ShoppingCart(Arrays.asList(item1,item2,item3));
		
		cart.displayItems();
		System.out.println("Total cart price is "+ cart.getCartPrice());
		
		

	}

}
