package com.techlabs.whileloops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int factorial=1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int number = scanner.nextInt();
		scanner.close();
		
		for(int i=1;i<=number;i++) {
			factorial*=i;
			
		}
		System.out.println("The Factorial of "+number +" is "+ factorial);
	}

}
