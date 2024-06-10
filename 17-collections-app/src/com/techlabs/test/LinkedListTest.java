package com.techlabs.test;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.addFirst("x");
		System.out.println(list);
		list.addAll(list);
		
		//zSystem.out.println(list);
		list.addLast("yyy");
		System.out.println(list);
		
	}

}
