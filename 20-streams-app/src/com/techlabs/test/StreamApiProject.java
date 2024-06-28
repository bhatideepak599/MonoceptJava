package com.techlabs.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiProject {

	 public static void main(String[] args) {
	        
	        String filePath = "C:\\Users\\bhati\\Desktop\\Assignments\\20-streams-app\\src\\com\\techlabs\\test\\names.txt";

	        try {
	        	
	        	
	            
	            List<String> names = readNamesFromFile(filePath);
	            System.out.print("1. List of all name "+names+"\n\n");
	            

	            List<String> filteredNames = names.stream()
	                                              .filter(name -> name.startsWith("A"))
	                                              .collect(Collectors.toList());
	            System.out.print("2. Names that starts with a are "+filteredNames+"\n\n");

	           
	            List<String> upperCaseNames = filteredNames.stream()
	                                                       .map(String::toUpperCase)
	                                                       .collect(Collectors.toList());
	            System.out.println("3. All names in UpperCase "+upperCaseNames+"\n\n");

	            
	            List<String> sortedNames = upperCaseNames.stream()
	                                                     .sorted()
	                                                     .collect(Collectors.toList());
	            
	            System.out.println("4. Sorted Names in alphabetic order are "+sortedNames+"\n\n");
	           
	            List<String> uniqueNames = sortedNames.stream()
	                                                  .distinct()
	                                                  .collect(Collectors.toList());
	            
	            System.out.println("5. Names after removing duplicates are "+uniqueNames+"\n\n");

	            
	            List<String> collectedNames = new ArrayList<>(uniqueNames);
	            System.out.println("6. New List Contaning Names are "+collectedNames+"\n\n");

	           
	            long count = collectedNames.stream()
	                                       .filter(name -> !name.contains("I"))
	                                       .count();
	            System.out.println("7. Number of names that do not contain 'I': " + count+"\n\n");

	           
	            String concatenatedNames = collectedNames.stream()
	                                                     .collect(Collectors.joining(", "));
	            System.out.println("8. Concatenated Names: " + concatenatedNames+"\n\n");

	            List<String> jNames = names.stream()
	                                       .filter(name -> name.startsWith("J"))
	                                       .map(String::toUpperCase)
	                                       .sorted()
	                                       .collect(Collectors.toList());
	            System.out.println("9. Names That starts with J : " + jNames);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    
	    private static List<String> readNamesFromFile(String filePath) throws IOException {
	        List<String> names = new ArrayList<>();
	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                names.add(line.trim());
	            }
	        }
	        return names;
	    }

}
