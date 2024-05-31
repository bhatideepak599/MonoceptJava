package com.techlabs.assignments;

import java.util.Scanner;

public class SecondGreatestElement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The size of the array :");
		int size= scanner.nextInt();
		
		int array[]=new int[size];
		System.out.println("Enter The values of array :");
		
		int maximum=array[0];
		
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
			
			if(array[i]>=maximum) {
				
				maximum=array[i];
			}
		}
		int second_max=Integer.MIN_VALUE;
		int count=0;
		for(int i=0;i<size;i++) {
			
			if(count==0 && array[i]==maximum) {
				count++;
				continue;
			}
			
			if(second_max<array[i]) {
				second_max=array[i];
			}
			
			
		}
		System.out.println("Second largest number is "+second_max);
		scanner.close();

	}

}
