package com.techlabs.assignments;

import java.util.Scanner;

public class FindingSubstring {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String string1,string2;
		
		System.out.println("Enter the First String : ");
		string1=scanner.next();
		
		System.out.println("Enter The Second String : ");
		string2=scanner.next();
		
		System.out.println(isSubstring(string1,string2));
			
		scanner.close();
	}
	
	private static boolean isSubstring(String string1, String string2) {
		
	 
			   
			  int ch1length=string1.length(); 
			  int ch2length=string2.length(); 
			  for(int i=0;i<ch1length;i++) { 
			   int j; 
			   for(j=0;j<ch2length;j++) { 
			    if(string1.charAt(i+j)!=string2.charAt(j)) { 
			     break; 
			      
			    } 
			   } 
			   if(j==ch2length) { 
			    return true; 
			   } 
			    
			  } 
			  return false; 
		
	 }
	

}
