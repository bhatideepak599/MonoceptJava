package com.techlabs.car;

import java.util.Scanner;

public class TestCar {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int numberOfCars;
		System.out.print("Enter The Number of Cars: ");
		numberOfCars=scanner.nextInt();
		Car[] cars=new  Car[numberOfCars];
		
		for(int i=0;i<numberOfCars;i++) {
			System.out.print("Enter The Company name: ");
			String companyName=scanner.next();
			System.out.print("Enter The Mileage Of Car: ");
			double mileage=scanner.nextDouble();
			System.out.print("Enter The Price of Car: ");
			double price=scanner.nextDouble();
			cars[i]=new Car(companyName,mileage,price);
		}
		int count=1;
		for(Car car:cars) {
			System.out.println("Car"+count+" "+car);
			count++;
		}

	}

}
