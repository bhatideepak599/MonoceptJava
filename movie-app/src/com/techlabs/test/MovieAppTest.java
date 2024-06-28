package com.techlabs.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.exception.CapacityFullException;
import com.techlabs.exception.NoSuchMovieFoundException;
import com.techlabs.model.Movie;
import com.techlabs.model.MovieApp;

public class MovieAppTest {

	public static void main(String[] args)   {
		int choice;
		MovieApp movieApp;
		try {
			movieApp = new MovieApp();
			Scanner scanner=new Scanner(System.in);
			do {
				MovieApp.displayMenu();
				choice=scanner.nextInt();
				
				switch (choice) {
			    
				case 1:
			        movieApp.displayMovies();
			        break;
			    
				case 2:
			    	try {
						movieApp.addMovie();
						
					} 
			    	catch (CapacityFullException e) {
						System.out.println(e.getMessage());
					}
			        break;
			    
				case 3:
			    	try {
			    		System.out.print("Enter the Movie id:");
			        	int id=scanner.nextInt();
						movieApp.displayMovie(id);
					} 
			    	catch (NoSuchMovieFoundException e1) {
						System.out.println(e1.getMessage());
					}
			        break;
			        
			    case 4:
			        System.out.println("Exiting...");
			        scanner.close();
			        break;
			    default:
			        System.out.println("Invalid choice. Please try again.");
			}
	   
			}
			while(choice!=4);
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		
		
		

	}

}
