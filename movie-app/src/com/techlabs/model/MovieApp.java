package com.techlabs.model;

import java.io.IOException;
import java.util.Scanner;

import com.techlabs.exception.CapacityFullException;
import com.techlabs.exception.NoSuchMovieFoundException;

public class MovieApp {
	public static Movie[] movies=new Movie[5];
	
	Scanner scanner =new Scanner(System.in);
	
	public void displayMovies() {
        if (Movie.moviesCount==0) {
            System.out.println("No movies found.");
            return;
        } 
            
        	System.out.println("\nMovies:");
            for(int i=0;i<Movie.moviesCount;i++)
                System.out.println(movies[i]);
            
        
    }
	
	
	public void addMovie() throws CapacityFullException {
        if (Movie.moviesCount == 5) {
            throw new CapacityFullException();
        }

        try {
        	System.out.print("Enter movie ID: ");
            int id = scanner.nextInt();
            
            System.out.print("Enter movie name: ");
            String name = scanner.next();

            System.out.print("Enter genre: ");
            String genre = scanner.next();

            System.out.print("Enter year: ");
            int year = scanner.nextInt();
            scanner.nextLine(); 

            movies[Movie.moviesCount]=new Movie(id, name, genre, year);
            Movie.moviesCount++;
            System.out.println("Movie added successfully.");
        }
        catch(Exception e) {
        	System.out.println("Id or Year Must be an Numerical Value");
        }
    }
	
	public void displayMovie(int movieId) throws NoSuchMovieFoundException {
		if (Movie.moviesCount==0) {
            System.out.println("Movie List is empty.");
            return;
        }
		
//		for(int i=0;i<Movie.moviesCount;i++) {
//			if(movies[i].getMovieId()==movieId) {
//				System.out.println("Movie is Present.");
//				System.out.println(movies[i]);
//				return;
//			}
		Movie[] m;
		try {
			m = Movie.loadMovies();
			for(Movie movie:m) {
				System.out.println(movie);
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void displayMenu() {
        System.out.println("\nSimple Movies App Menu....");
        System.out.println("1. Display Movies");
        System.out.println("2. Add Movie");
        System.out.println("3. Display A Single Movie with Movie id.");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
	
	
}
