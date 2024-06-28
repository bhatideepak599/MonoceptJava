package com.techlabs.test;

import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		Predicate<Integer> evenPredicate=(number)->{
			if(number%2==0) return true;
			return false;
		};
		
		System.out.println(evenPredicate.test(5));
		BiPredicate<Integer,Integer> biPredicate=(number1 ,number2)->{
						return number1>number2;
		};
		if(biPredicate.test(18,20)) {
			System.out.println("Number1 is Greater than Number2");
			System.exit(0);
		}
		System.out.println("Number2 is Greater than Number1");
		
		
	}

}
