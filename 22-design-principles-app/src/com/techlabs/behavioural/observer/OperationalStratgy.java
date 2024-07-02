package com.techlabs.behavioural.observer;

public class OperationalStratgy implements IOperation {

	IOperation iOperation;

	public OperationalStratgy(IOperation iOperation) {
		super();
		this.iOperation = iOperation;
	}

	public void setOperation(IOperation iOperation) {
		this.iOperation = iOperation;
	}

	@Override
	public int doOperation(int number1, int number2) {

		return iOperation.doOperation(number1, number2);
	}

}
