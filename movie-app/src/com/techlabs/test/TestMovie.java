package com.techlabs.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.model.Movie;
import com.techlabs.model.MovieSerialization;

public class TestMovie {

	public static void main(String[] args) {
		Movie[] movies=new Movie[5];
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<1;i++) {
			
				System.out.println("Enter Details of Movie"+(i+1)+":");
			 	System.out.print("Enter movie ID: ");
			 	try {
		        int id = scanner.nextInt();
		        
		        System.out.print("Enter movie name: ");
		        String name = scanner.next();

		        System.out.print("Enter genre: ");
		        String genre = scanner.next();

		        System.out.print("Enter year: ");
		        int year = scanner.nextInt();
		        scanner.nextLine();
		        movies[i]=(new Movie(id,name,genre,year));
			 	}
			 	catch (Exception e) {
			 		System.out.println("Id and Year must be a numerical value");
			 	}
		}
		
		try {
			MovieSerialization.saveMovies(movies);
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
		
		try {
			Movie[] moviesDes=MovieSerialization.loadMovies();
			for(Movie movie:moviesDes) {
				System.out.println(movie);
			}
		} catch (ClassNotFoundException | IOException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
