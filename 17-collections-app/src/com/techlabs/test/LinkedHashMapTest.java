package com.techlabs.test;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(11, "Hello");
		map.put(1,"a");
		map.put(3,"c");
		System.out.println(map);
	}

}
