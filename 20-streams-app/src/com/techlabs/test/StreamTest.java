package com.techlabs.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(100,25,35,20,555,60);
		
		System.out.println("All Numbers of List.");
		numbers.stream()
		.forEach((x)->System.out.println(x));
		
		System.out.println("Odd Numbers of List.");
		numbers.stream()
		.filter((x)->x%2!=0)
		.forEach((x)->System.out.println(x));
		
		System.out.println("Even Numbers of List.");
		List<Integer> evenNumbers=numbers.stream()
		.filter((x)->x%2==0)
		.collect(Collectors.toList());
		
		evenNumbers.stream()
		.forEach((x)->System.out.println(x));
		
		int sum=numbers.parallelStream().reduce(0,(sum1,x)->sum1+x);
		System.out.println("Sum is "+sum);
		
		List<Integer> multiplication=numbers.parallelStream().map((x)->x*5).collect(Collectors.toList());
		System.out.println("All Numbers of List after multiplying by 5.");
		multiplication.stream()
		.forEach((x)->System.out.println(x));
		
		System.out.println("After Sorting.");
		numbers.stream().sorted().forEach((x)->System.out.print(x+" "));
		System.out.println();
		System.out.println("4 elements After Sorting.");
		numbers.stream().sorted()
		.limit(4)
		.forEach((x)->System.out.print(x+" "));
		
		
		
		
	}

}
