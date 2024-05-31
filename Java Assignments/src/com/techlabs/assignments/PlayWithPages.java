package com.techlabs.assignments;

import java.util.Scanner;
import java.util.Random;

public class PlayWithPages {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		String player1,player2;
		System.out.print("Enter Name of player1->");
		player1=scanner.next();
		
		System.out.print("Enter Name of player2->");
		player2=scanner.next();
		
		int array[]=new int[2];
		
		System.out.println(player1+" Starts playing->");
		
		int player1Turns=0;
		int player1_total_score=0;
		 
		 
		array=letsPlay();
		player1_total_score=array[0];
		player1Turns=array[1];
		System.out.println(player1+"'s Total Score is "+player1_total_score+" in "+array[1]+" turns");
			
			
			System.out.println();
			System.out.println(player2+" Starts playing->");
			int player2Turns;
			 int player2_total_score;
			
			 array=letsPlay();
			 player2_total_score=array[0];
			 player2Turns=array[1];
			 
			 System.out.println(player2+"'s Total Score is "+player2_total_score+" in "+array[1]+" turns");
				System.out.println();
				if(player1_total_score>player2_total_score) {
					System.out.println(player1+" is Winner");
				}
				else if(player1_total_score<player2_total_score) {
					System.out.println(player2+" is Winner");
				}
				else {
					if(player2Turns<player1Turns)System.out.println(player2+" is Winner");
					else if(player2Turns>player1Turns)System.out.println(player1+" is Winner");
					else System.out.println("Game is drawn");
				}
				
				scanner.close();
	
	
	
	
	}

	private static int[] letsPlay() {
		
		Scanner scanner =new Scanner(System.in);
		int score=0,turn=1;
		int total_score=0;
		char choice='y';//scanner.next().charAt(0);
		
		System.out.println("Turn : "+ turn);
		Random random= new Random();
		int page_number=random.nextInt(301);
		score=page_number%7;
		total_score+=score;
		
		System.out.println("score :"+score);
		System.out.println("Total Score: "+ total_score );
		
		while(turn<301 && choice!='n' && score!=0) {
			
			
			System.out.print("Continue Playing-> y/n: ");
			choice=scanner.next().charAt(0);
			if(choice=='n') break;
			turn++;
			System.out.println("Turn : "+ turn);
			page_number=random.nextInt(300)+1;
			System.out.println("Page Number Generated->"+page_number+" ( "+page_number+"%7="+page_number%7+")");
			score=page_number%7;
			total_score +=score;
			System.out.println("Score : "+score);
			System.out.println("Total Score : "+total_score);
			
			
		}
		int array[]=new int[2];
		array[0]=total_score;
		array[1]=turn;
		
		//scanner.close();
		return array;
	}
	
	
	
	

	
}
