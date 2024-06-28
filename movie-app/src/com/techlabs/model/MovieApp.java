package com.techlabs.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.exception.CapacityFullException;
import com.techlabs.exception.NoSuchMovieFoundException;

public class MovieApp {
	
	Scanner scanner =new Scanner(System.in);
	Movie[] movies=new Movie[5];
	private static int count=0;
	
	public MovieApp() throws ClassNotFoundException, IOException {
		super();
		this.movies=MovieSerialization.loadMovies();
	}
	
	public void displayMovies() {
		for(int i=0;i<5;i++) {
			if(movies[i]!=null) {
				System.out.println(movies[i]);
			}
		}
            
        
    }
	
	
	


	public void addMovie() throws CapacityFullException {
        if (count==5) {
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

            movies[count]=(new Movie(id, name, genre, year));
            count++;
            MovieSerialization.saveMovies(movies);
            
            System.out.println("Movie added successfully.");
        }
        catch(Exception e) {
        	System.out.println("Id or Year Must be an Numerical Value");
        }
    }
	
	public void displayMovie(int movieId) throws NoSuchMovieFoundException {
		if (count==0) {
            System.out.println("Movie List is empty.");
            return;
        }
		
		
		Movie[] m;
		try {
			m = MovieSerialization.loadMovies();
			for(int i=0;i<count;i++) {
				if(m[i].getMovieId()==movieId) {
					System.out.println("Movie is Present.");
					System.out.println(m[i]);
					return;
				}
			
		}
		}
		catch (ClassNotFoundException e) {
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
