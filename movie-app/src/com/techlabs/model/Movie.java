package com.techlabs.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Movie implements Serializable {
	private int movieId;
	private String name;
	private String genre;
	private int year;
	public static int moviesCount=0;
	public Movie(int movieId, String name, String genre, int year) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.genre = genre;
		this.year = year;
	}
	
	public int getMovieId() {
		return movieId;
	}
	
	private static final String fileName= "movies.txt"; 

	  public static void saveMovies(Movie[] movies) throws IOException {
	    FileOutputStream fileOut = new FileOutputStream(fileName);
	    ObjectOutputStream out = new ObjectOutputStream(fileOut);
	    out.writeObject(movies);
	    out.close();
	    fileOut.close();
	  }

	  public static Movie[] loadMovies() throws IOException, ClassNotFoundException {
	    FileInputStream fileIn = new FileInputStream(fileName);
	    ObjectInputStream in = new ObjectInputStream(fileIn);
	    Movie[] movies = (Movie[] ) in.readObject();
	    in.close();
	    fileIn.close();
	    return movies;
	  }
	@Override
	public String toString() {
		return "Movie [MovieId=" + movieId + ", Movie Name=" + name + ", Genre=" + genre + ", Year=" + year + "]";
	}
	 
	
	
	 
	
}
