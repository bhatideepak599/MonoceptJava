package com.techlabs.assignments;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Random random= new Random();
		Scanner scanner= new Scanner(System.in);
		int random_number= random.nextInt(100);
		//System.out.println(random_number);
		
		int total_guess=1;
		
		System.out.println("Enter a Number : ");
		int guess=scanner.nextInt();
		
		while(true) {
			
			if(guess ==random_number) {
				System.out.println("You Gussed it correctly in "+ total_guess +" number of guesses." );
				break;
			}
			else if(total_guess >=10) {
				System.out.println("Opps...!!!...\nYou Lost The Game.");
				break;
			}
			else {
				if(guess > random_number) {
					System.out.println("Enter a Number less than "+ guess +".");
					guess=scanner.nextInt();
					
				}
				else {
					System.out.println("Enter a Number Greater than "+ guess+".");
					guess=scanner.nextInt();
				}
				total_guess++;
			}
		}
		scanner.close();

	}

}
