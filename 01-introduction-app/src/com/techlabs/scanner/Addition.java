package com.techlabs.scanner;
import java.util.Scanner;
public class Addition {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st No: ");
		int a= sc.nextInt();
		System.out.println("Enter 2nd No: ");
		int b=sc.nextInt();
		
		System.out.println(a+b);
	}
}
