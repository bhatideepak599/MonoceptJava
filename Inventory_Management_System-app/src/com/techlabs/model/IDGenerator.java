package com.techlabs.model;

import java.util.HashMap;
import java.util.Random;

public class IDGenerator {
	private static HashMap<String,Boolean > hashmap=new HashMap<String,Boolean>();
	public static String generateID() {
		String id;
		
        id= Integer.toString(Math.abs(new Random().nextInt()));
        
        if(hashmap.containsKey(id)) return generateID();
        hashmap.put(id, true);
        return id;
        
    }
}
