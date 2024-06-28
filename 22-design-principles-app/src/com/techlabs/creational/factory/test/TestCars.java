package com.techlabs.creational.factory.test;

import com.techlabs.creational.factory.model.CarFactory;
import com.techlabs.creational.factory.model.ICar;

public class TestCars {

	public static void main(String[] args) {
		
		ICar car=CarFactory.getCar("Maruti");
		
		car.start();
		car.stops();
		
		car=CarFactory.getCar("Tata");
		car.start();
		car.stops();
		
		car=CarFactory.getCar("Mahindra");
		car.start();
		car.stops();
		
		
		
		

	}

}
