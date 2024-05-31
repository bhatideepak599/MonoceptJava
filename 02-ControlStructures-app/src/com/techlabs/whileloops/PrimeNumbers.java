package com.techlabs.whileloops;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		int cur=0,prev=0;
		Scanner scanner = new Scanner(System.in);
		
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		if(number1==1) number1++;
		
		for(int i=number1;i<=number2;i++) {
			boolean b=true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					b=false;
					break;
				}
			}
			if(b) {
				if(prev+1 == cur) {
					System.out.println();
					prev=cur;
					cur=0;
				}
				System.out.print(i+"	");
				cur++;
			}
		}
	}

}
