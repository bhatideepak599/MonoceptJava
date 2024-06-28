package com.techlabs.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentStreamTest {

	public static void main(String[] args) {
		List<String> names= Arrays.asList("Jayesh","Nimesh","Mark","Mahesh","Ramesh");
			
		System.out.print("First 3 students sorted in ascending order are: [");
		names.stream()
		.sorted()
		.limit(3)
		.forEach((x)->System.out.print(x+", "));
		System.out.print("]");
		System.out.println();
		System.out.println();
		System.out.print("First 3 students sorted in ascending order having a in the name : [");
		
		
		names.stream()
		.filter((x)->x.contains("a")==true)
		.sorted()
		.limit(3)
		
		.forEach((x)->System.out.print(x+", "));
		System.out.print("]");
		
		System.out.println();
		System.out.println();
		
		System.out.print("Students in Descnding order: [");
		
		names.stream()
		.sorted(Collections.reverseOrder())
		.forEach((x)->System.out.print(x+", "));
		System.out.print("]");
		
		System.out.println();
		System.out.println();
		System.out.print("First 3 characters of all names: [");
		names.stream()
		.forEach((x)-> System.out.print(x.substring(0, 3) +", "));
		System.out.print("]");
		
		System.out.println();
		System.out.println();
		System.out.print("Names of the students that contains less than or equal to 4 characters: [");
		names.stream()
		.filter((x)->x.length()<5)
		.forEach((x)->System.out.print(x+" "));
		System.out.print("]");
		
		

//		1. first 3 students sorted in ascending order
//		2. first 3 students sorted in ascending order if it contains 'a'
//		3. students in descnding order
//		4. first 3 characters of all names:
//		5. names of the students that contains less than or equal to 4 characters

	}

}
