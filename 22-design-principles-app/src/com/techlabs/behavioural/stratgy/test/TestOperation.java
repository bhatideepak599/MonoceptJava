package com.techlabs.behavioural.stratgy.test;

import com.techlabs.behavioural.stratgy.model.AddOperation;
import com.techlabs.behavioural.stratgy.model.IOperation;
import com.techlabs.behavioural.stratgy.model.MultiplyOperation;
import com.techlabs.behavioural.stratgy.model.OperationalStratgy;

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
