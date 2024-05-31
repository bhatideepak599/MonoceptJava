package com.techlabs.assignments;

import java.util.Scanner;

public class SquaredArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter The size of array : ");
		int n=scanner.nextInt();
		
		int array[]= new int[n];
		System.out.println("Enter entries of array ");
		
		int mark=-1;
		for(int i=0;i<n;i++) {
			array[i]=scanner.nextInt();
			if(array[i] <0 ) {
				mark=i;
			}
			
		}
		
		scanner.close();
		for(int i=0;i<n;i++) {
			array[i]*= array[i];
		}
		
		if(mark!=-1) {
			
			getSortedArray(array,n,mark);
		}
		
		System.out.print("Sorted array is : ");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	private static void getSortedArray(int [] array,int n,int mark ) {
		
		int i=mark,j=mark+1,k=0;
		int temparray[]=new int[n];
		
		while(i>=0 && j<n ) {
			if(array[i]<=array[j]) {
				temparray[k++]=array[i--];
			}
			else {
				temparray[k++]=array[j++];
			}
		}
		
		while(i>=0) {
			temparray[k++]=array[i--];
		}
		
		while(j<n) {
			temparray[k++]=array[j++];
		}
		
		for(int x=0;x<n;x++) {
			array[x]=temparray[x];
		}
	}

}
