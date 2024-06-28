package com.techlabs.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class Movie implements Serializable {
	
	private int movieId;
	private String name;
	private String genre;
	private int year;
	
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
	
		@Override
	public String toString() {
		return "Movie [MovieId=" + movieId + ", Movie Name=" + name + ", Genre=" + genre + ", Year=" + year + "]";
	}
	 
	
	
	 
	
}
