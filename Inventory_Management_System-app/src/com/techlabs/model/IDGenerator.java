package com.techlabs.model;

import java.util.HashMap;
import java.util.UUID;

public class IDGenerator {
	private static HashMap<String,Boolean > hashmap=new HashMap<String,Boolean>();
	public static String generateID() {
		String id;
        id= UUID.randomUUID().toString();
        if(hashmap.containsKey(id)) return generateID();
        hashmap.put(id, true);
        return id;
        
    }
}
