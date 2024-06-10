package com.techlabs.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int number1;
		int number2;
		double division;
		
		number1=Integer.parseInt(args[0]);
		
		
		number2=Integer.parseInt(args[1]);
		
		try {
			division=number1/number2;
			System.out.println("Division is "+division);
			
			
			
		} 
		
//		catch (ArithmeticException e) {
//			System.out.println("Division with 0 is  not possible");
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Give all the values");
//		}
		finally {
			System.out.println("aya");
		}
		
		
	}

}
