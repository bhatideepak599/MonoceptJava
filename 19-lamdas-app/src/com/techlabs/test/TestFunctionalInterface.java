package com.techlabs.test;

import java.lang.annotation.Annotation;

import com.techlabs.model.FunctionalInterface1;

public class TestFunctionalInterface {

	public static void main(String[] args) {
		FunctionalInterface1 functionalInterface= ()-> System.out.println("test1.......");
			
		functionalInterface.test1();
	}

}
