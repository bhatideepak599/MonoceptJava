package com.techlabs.test;

import com.techlabs.model.IAddition;

public class TestAdd {

	public static void main(String[] args) {
		IAddition iAdd= (int a,int b)-> {return a+b; };
		
		System.out.println(iAdd.add(5, 15));
	}

}
