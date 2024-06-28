package com.techlabs.test;

import java.util.function.Function;

import com.techlabs.model.ConstructorClass;

public class ConstructorTest {

	public static void main(String[] args) {
		Function<String, ConstructorClass> function = ConstructorClass::new;
		ConstructorClass constructorTest= function.apply("Welcome...");
        System.out.println( constructorTest);
	}

}
