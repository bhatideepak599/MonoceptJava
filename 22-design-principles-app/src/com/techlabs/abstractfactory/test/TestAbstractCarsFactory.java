package com.techlabs.abstractfactory.test;

import com.techlabs.abstractfactory.model.ICarFactory;
import com.techlabs.abstractfactory.model.ICars;
import com.techlabs.abstractfactory.model.MarutiFactory;

public class TestAbstractCarsFactory {

	public static void main(String[] args) {
		ICarFactory marutifactory=new MarutiFactory();
		ICars maruti=marutifactory.makeCar();
		
		maruti.start();
		maruti.stops();
		
		
	}

}
