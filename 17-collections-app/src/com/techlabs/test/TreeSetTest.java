package com.techlabs.test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> set=new TreeSet<String>();
		set.add("aby");
		set.add("abz");
		set.add("abx");
		
		System.out.println(set);
	}

}
