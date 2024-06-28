package com.techlabs.structural.facade.test;

import java.util.Scanner;

import com.techlabs.structural.facade.model.HotelReception;

public class TestHotel {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		HotelReception hotelReception=new HotelReception();
		//System.out.println("Select Menu: 1. Indian Menu 2.Italian Menu");
		
		int choice;
		do {
			System.out.println("Select Menu: \n1. Indian Menu. \n2. Italian Menu. \n3. Exit");
			System.out.print("Enter Your Choice: ");
			choice =scanner.nextInt();
			
			switch(choice) {
				case 1: hotelReception.getIndainMenu();
						break;
						
				case 2:
						hotelReception.getItalianMenu();
						break;
				case 3:
						System.out.println("Exiting....");
						break;
				default :
					    System.out.println("Invalid Choice");
			}
		}
		while(choice!=3);
	}

}
