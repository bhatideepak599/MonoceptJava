package com.techlabs.behavioural.stratgy.model;

public class AddOperation implements IOperation {

	@Override
	public int doOperation(int number1, int number2) {
		return number1+number2;
		
	}

}
