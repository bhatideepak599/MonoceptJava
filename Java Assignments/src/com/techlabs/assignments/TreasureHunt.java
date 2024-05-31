package com.techlabs.assignments;

import java.util.Scanner;

public class TreasureHunt {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Treasure Island.");
		Scanner scanner= new Scanner(System.in);
		System.out.println("left or right ?");
		String move1=scanner.next();
		
		if(move1.equals("left")) {
			System.out.println("swim or wait ?.");
			String move2=scanner.next();
			
			if(move2.equals("wait")) {
				System.out.println("Which door?");
				String move3=scanner.next();
				
				scanner.close();
				if(move3.equals("red")) {
					System.out.println("Burned by fire.");
					System.out.println("Game Over.");
				}
				else if(move3.equals("blue")) {
					System.out.println("Eaten by Beasts.");
					System.out.println("Game Over.");
				}
				else if(move3.equals("yellow")) {
					System.out.println("You Win!");
					
				}
				else {
					System.out.println("Game Over.");
				}
			}
			
			else {
				System.out.println("Attacked by trout.");
				System.out.println("Game Over.");
			}
		}
		else {
			System.out.println("Fall into a hole.");
			System.out.println("Game Over.");
		}
		
	}
	

}
