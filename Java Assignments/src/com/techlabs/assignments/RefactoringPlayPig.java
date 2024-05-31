package com.techlabs.assignments;

import java.util.Random;
import java.util.Scanner;

public class RefactoringPlayPig {

	public static void main(String[] args) {
		Random random= new Random();
		Scanner scanner= new Scanner(System.in);
		
		
		int total_score=0;
		int turn=0;
		
		while(total_score<20) {
			turn++;
			System.out.println("TURN "+turn);
			
			
			int score=rollDice(total_score);
			total_score+=score;
			
			if(score==0) System.out.println("Turn over. No Score");
			if(score!=0) System.out.println("Score for turn: "+score);
			
			System.out.println("Total Score: "+total_score);
			System.out.println();
			
		}
		
		System.out.println("You finished in "+ turn +" turns! \nGame over!");
	}

	private static int rollDice(int total_score) {
		
		int current_score=0;
		Scanner scanner= new Scanner(System.in);
		Random random= new Random();
		char choice='k';
		int die=0;
		
		while(true) {
			if(total_score+current_score>=20) return current_score;
			
			if(die==1) return 0;
			
			
			System.out.print("Roll or Hold ? (r/h): ");
			choice=scanner.next().charAt(0);
			if(choice=='h') return current_score;
			die=random.nextInt(6)+1;
			
			System.out.println("Die: "+die);
			if(die!=1)
				current_score+=die;
			if(die==1) current_score=0;
		}
		
	}

	

}
