package com.techlabs.assignments;
import java.util.Scanner;

public class TotalWaterBill {

	public static void main(String[] args) {
		 	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number of Units Consumed:");
		int units_consumed = scanner.nextInt();
		scanner.close();
        int meter_charges = 75;
        int charge;
        
        if (units_consumed <= 100) 
            charge = units_consumed * 5;
        
        else if (units_consumed <= 250) 
            charge = units_consumed * 10;
        
        else 
            charge = units_consumed * 20;
        
        
        int total = charge + meter_charges;
        System.out.println(total);


	}

}
