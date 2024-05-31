package com.techlabs.assignments;

import java.util.Scanner;

public class AdditionOfMatrices {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of rows :");
		int row= scanner.nextInt();
		System.out.println("Enter the number of columns :");
		int column= scanner.nextInt();
		
		int array[][]=new int[row][column];
		
		System.out.println("Enter the values 1st Matrix row wise :");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				array[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("Enter the values 2nd Matrix row wise :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				array[i][j]+=scanner.nextInt();
			}
		}
		
		System.out.println("Matrix after addition : ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
