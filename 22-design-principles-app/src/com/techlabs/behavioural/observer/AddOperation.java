package com.techlabs.behavioural.observer;

public class AddOperation implements IOperation {

	@Override
	public int doOperation(int number1, int number2) {
		return number1+number2;
		
	}

}
