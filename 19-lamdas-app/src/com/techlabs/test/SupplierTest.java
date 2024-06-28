package com.techlabs.test;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		Supplier<Integer> supplier=()-> {
			//System.out.println(java.time.LocalDate.now());
			return new Random().nextInt();
		};
		
		System.out.println(supplier.get());
		
		Supplier<LocalDate> supplier1=()-> {
			//System.out.println(java.time.LocalDate.now());
			return java.time.LocalDate.now();
		};
		System.out.println(supplier1.get());
		
	}

}
