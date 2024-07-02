package com.techlabs.behavioural.observer.test;

import com.techlabs.behavioural.observer.AddOperation;
import com.techlabs.behavioural.observer.IOperation;
import com.techlabs.behavioural.observer.MultiplyOperation;
import com.techlabs.behavioural.observer.OperationalStratgy;

public class TestOperation {

	public static void main(String[] args) {
		IOperation add=new AddOperation();
		IOperation multiply=new MultiplyOperation();
		
		OperationalStratgy operation=new OperationalStratgy(add);
		System.out.println("Addition : "+operation.doOperation(10,12));
		
		operation.setOperation(multiply);
		System.out.println("Multiplication : "+operation.doOperation(10,12));
		
		
		
		
		
	}

}
