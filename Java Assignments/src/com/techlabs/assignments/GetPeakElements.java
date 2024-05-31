package com.techlabs.assignments;

import java.util.Scanner;

public class GetPeakElements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The size of the array :");
		int size= scanner.nextInt();
		
		int array[]=new int[size];
		System.out.println("Enter The values of array :");
		
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
		}
		
		System.out.print("Peak Elements are :");
		if(size==1) System.out.print(array[0]);
		if(size>1) {
			if(array[0]>array[1]) System.out.print(array[0]+" ");
		}
		
		for(int i=1;i<size-1;i++) {
			if(array[i]>array[i-1] && array[i]> array[i+1] ) {
				System.out.print(array[i]+" ");
			}
		}
		
		if(size>1 && array[size-1]>array[size-2]) System.out.print(array[size-1]);

	}

}
