package com.techlabs.tokens;

import java.util.Scanner;

public class SeasonChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Month Number:");
		
		
		int month = scanner.nextInt();
		
		switch(month) {
		 case 1:
		 case 2: 	System.out.println("Winter");
		
		 			break;
		 
		 case 3:
		 case 4:
		 case 5: 	System.out.println("Summer");
	 				break;
			 
		 case 6:
		 case 7:
		 case 8:
		 case 9:	System.out.println("Monsoon");
					break;
				
		 case 10:
		 case 11:	System.out.println("Autumn ");
					break;
			 
		 case 12:	System.out.println("Winter");
					break;
					
		default:	System.out.println("Please enter a valid month number ");
			 
		}
		scanner.close();

	}

}
