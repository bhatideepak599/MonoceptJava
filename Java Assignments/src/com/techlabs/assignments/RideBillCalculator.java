package com.techlabs.assignments;

import java.util.Scanner;

public class RideBillCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the height in cm:");
		
		int height = scanner.nextInt();
		
		if(height <= 120) 
			System.out.println("Can't Ride");
		
		else {
			System.out.println("Can Ride");
			
			System.out.println("Enter Your age : ");
			int age=scanner.nextInt();
			int ride_charges,photo_charges=0,total_bill=0;
			
			if(age < 12) 
				ride_charges=5;
			
			else if( age >= 12 && age < 18 )
				ride_charges=7;
			
			else {
				
				if(age >=45 && age <=55) 
					ride_charges=0;
				else 
					ride_charges=12;
			}
			
			System.out.println("Want photos ?");
			System.out.println("yes / no");
			
			String want_photo=scanner.next();
			
			 scanner.close();
			
			if(want_photo.equals("yes")) 
				photo_charges=3;
			
			total_bill= photo_charges +ride_charges;
			
			System.out.println("The Total Bill is $" +total_bill);
		}

	}

}
