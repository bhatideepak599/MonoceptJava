package com.techlabs.test;

import java.util.List;
import java.util.ArrayList;

public class ArraylistTest {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("5");
		
		list.add(0,"55");
		System.out.println(list);
		
		System.out.println(list.lastIndexOf("5"));
		
		
		

	}

}
