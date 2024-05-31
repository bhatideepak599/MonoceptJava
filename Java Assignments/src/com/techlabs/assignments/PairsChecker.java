package com.techlabs.assignments;

import java.util.Scanner;
import java.util.Arrays;

public class PairsChecker {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		long sum=0;
		System.out.println("Enter The size of the array :");
		int size= scanner.nextInt();
		
		int array[]=new int[size];
		System.out.println("Enter The values of array :");
		
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
			sum+=array[i];
			}
		
		if(checkPairs(size,sum,array)) {
			System.out.println("Pairs are present.");
		}
		else {
			System.out.println("Pairs are not present.");
		}
		
		scanner.close();
		

	}
	
	private static boolean checkPairs(int size,long sum,int[] array) {
		
		if(sum%size!=0) return false;
		
		int minimum=0,maximum=0;
		
		for(int i=0;i<size;i++) {
			if(minimum>array[i]) minimum=array[i];
			if(maximum<array[i]) maximum=array[i];
		}
		
		int average=(int)sum/size;
		if(minimum<0) minimum=-minimum;
		
		int negative[]=new int[minimum+1];
		int positive[]=new int[maximum+1];
		
		
		for(int i=0;i<size;i++) {
			if(array[i]>=0) positive[array[i]]++;
			if(array[i]<0) negative[-array[i]]++;
			
			int target= average-array[i];
			if(target>=0) {
				if((target <= maximum) && positive[target]>0) return true;
			}
			else {
				if((-target)<=(-minimum)&& negative[-target]>0) return true;
			}
		}
		
		return false;
}
	
	
	private static boolean checkPairs2(int size,long sum,int[] array) {
		if(sum%size!=0) return false; //
		
		Arrays.sort(array);
		
		int i=0,j=size-1;
		int average=(int)sum/size;
		
		while(i<j) {
			if(array[i]+array[j]==average) return true;
			else if(array[i]+array[j] < average) i++;
			else j--;
		}
		return false;
	}
}
