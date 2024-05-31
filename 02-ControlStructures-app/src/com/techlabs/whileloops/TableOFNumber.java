package com.techlabs.whileloops;

import java.util.Scanner;

public class TableOFNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int number = scanner.nextInt();
		scanner.close();
		
		int i=1;
		while(i<=10) {
			System.out.println(number +" * "+ i +" = "+ number*i);
			i++;
		}
	}

}
