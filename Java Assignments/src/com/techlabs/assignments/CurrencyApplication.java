package com.techlabs.assignments;

import java.util.Scanner;

public class CurrencyApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Amount less than 50000 :");
		
		int amount = scanner.nextInt();
		
		if(amount >50000) {
			System.out.println("Amount Should be less than 50000.");
		}
		else if(amount %100 !=0 ) {
			System.out.println("Amount Should be a multiple of 100.");
		}
		else {
			if(amount / 2000 >0 && amount>0) {
				System.out.println("2000 Notes : "+ amount/2000);
				amount%=2000;
			}
			if(amount / 500 >0 && amount>0) {
				System.out.println("500 Notes : "+ amount/500);
				amount%=500;
			}
			if(amount /100 >0 && amount>0) {
				System.out.println("100 Notes : "+ amount/100);
				amount%=100;
			}
		}
		scanner.close();
	}

}
