package com.techlabs.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MovieSerialization {
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
	     
	    in.close();
	    fileIn.close();
	    return (Movie[] ) in.readObject();
	  }

}
