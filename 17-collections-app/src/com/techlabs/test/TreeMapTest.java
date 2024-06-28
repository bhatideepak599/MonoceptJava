package com.techlabs.test;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<Integer,String>();
		map.put(2, "Hello");
		map.put(1,"a");
		map.put(3,"c");
		System.out.println(map);

	}

}
