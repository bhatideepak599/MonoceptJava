package com.techlabs.assignments;

import java.util.Scanner;

public class ProductArray {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The size of the array :");
		int size= scanner.nextInt();
		
		int array[]=new int[size];
		System.out.println("Enter The values of array :");
		
		long product=1;
		int count=0;
		
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
			if(array[i]!=0) product*=array[i];
			else count++;
		}
		
		for(int i=0;i<size;i++) {
			if(count>0) {
				if(array[i]==0 && count==1) array[i]=(int)product;
				else array[i]=0;
			}
			else {
				array[i]=(int) product/array[i];
			}
		}
		System.out.print("Product Array is :");
		
		for(int i=0;i<size;i++ ) System.out.print(array[i]+" ");
		
		scanner.close(); 
		
	}

}
