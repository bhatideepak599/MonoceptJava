package com.techlabs.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(11, "Hello");
		map.put(1,"a");
		map.put(3,"c");
		System.out.println(map);
		
		Set<Map.Entry<Integer,String>> set=map.entrySet();
		
		for(Map.Entry entry:set) {
			System.out.println(entry);
		}
		
		

	}

}
