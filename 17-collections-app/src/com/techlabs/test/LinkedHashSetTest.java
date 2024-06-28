package com.techlabs.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		
		Set<String> set=new LinkedHashSet<String>();
		set.add("abx");
		set.add("aby");
		set.add("abz");
		System.out.println(set);

	}

}
