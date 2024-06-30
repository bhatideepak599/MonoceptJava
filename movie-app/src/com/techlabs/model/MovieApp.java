package com.techlabs.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.exception.CapacityFullException;
import com.techlabs.exception.NoSuchMovieFoundException;

public class MovieApp {
	
	Movie[] movies=new Movie[5];
    private int count;
    String FILENAME = "\"C:\\Users\\bhati\\Desktop\\Assignments\\movie-app\\movies.txt\"";

    public void SimpleMoviesApp() throws IOException, ClassNotFoundException {
        this.movies = MovieSerialization.loadMovies(FILENAME);
        this.count = 0;
        for (int i = 0; i < 5; i++) {
            if (movies[i] != null) {
                this.count++;
            }
        }
    }

    public void displayMovies() {
        for (int i = 0; i < 5; i++) {
            if (movies[i] != null) {
                System.out.println(movies[i]);
            }
        }System.out.println("No movies Added");
    }

    public void addMovie(Movie movie) throws CapacityFullException, IOException {
        if (count >= 5) {
            throw new CapacityFullException();
        }
        for (int i = 0; i < 5; i++) {
            if (movies[i] == null) {
                movies[i] = movie;
                count++;
                MovieSerialization.saveMovies(movies, FILENAME);
                return;
            }
        }
       
        
    }

    public void displayMovie(int movieId) throws NoSuchMovieFoundException {
        for (int i = 0; i < 5; i++) {
            if (movies[i] != null && movies[i].getMovieId() == movieId) {
                System.out.println(movies[i]);
                return;
            }
        }
        throw new NoSuchMovieFoundException("No Such Movie Found..");
    }
}
