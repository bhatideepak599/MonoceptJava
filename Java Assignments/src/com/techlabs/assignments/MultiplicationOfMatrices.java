package com.techlabs.assignments;

import java.util.Scanner;

public class MultiplicationOfMatrices {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of rows of 1st matrix :");
		int row1= scanner.nextInt();
		System.out.println("Enter the number of columns of 1st matrix :");
		int column1= scanner.nextInt();
		
		int array1[][]=new int[row1][column1];
		
		System.out.println("Enter the values 1st Matrix row wise :");
		
		for(int i=0;i<row1;i++) {
			for(int j=0;j<column1;j++) {
				array1[i][j]=scanner.nextInt();
			}
		}
		
		
		System.out.println("Enter the number of rows of 2nd matrix :");
		int row2= scanner.nextInt();
		System.out.println("Enter the number of columns of 2nd matrix :");
		int column2= scanner.nextInt();
		
		int array2[][]=new int[row2][column2];
		System.out.println("Enter the values 2nd Matrix row wise :");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<column2;j++) {
				array2[i][j]=scanner.nextInt();
			}
		}
		
		
		if(column1!=row2) {
			System.out.println("Multiplication is not possible");
		}
		else {
			int productMatrix[][]=new int[row1][column2];
			
			System.out.println("Matrix after Multiplication is");
			
			for(int i=0;i<row1;i++) {
				for(int j=0;j<column2;j++) {
					
					for(int k=0;k<row2;k++) {
						productMatrix[i][j] 
		                        += array1[i][k] * array2[k][j]; 
					}
					System.out.print(productMatrix[i][j]+" ");
				}
				System.out.println();
			}
			

		}
		
		scanner.close();
	}
	
	
	
}
