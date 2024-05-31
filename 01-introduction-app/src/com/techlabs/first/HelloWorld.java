package com.techlabs.first;
import java.util.Scanner; 
import java.util.Arrays; 

public class HelloWorld { 
 
 
	public static void main(String[] args) { 
		  Scanner scanner=new Scanner(System.in); 
		  //System.out.println("Enter the string"); 
		  //String ch1=scanner.nextLine(); 
		  //System.out.println("Enter the SubString"); 
		  //String ch2=scanner.nextLine(); 
		  //System.out.println(isSubstring(ch1,ch2)); 
		  
		  String s="";
		  System.out.println(s.length());
		        
		 } 
		 public static boolean isSubstring(String ch1, String ch2) { 
		   
		  int ch1length=ch1.length(); 
		  int ch2length=ch2.length(); 
		  for(int i=0;i<ch1length;i++) { 
		   int j; 
		   for(j=0;j<ch2length;j++) { 
		    if(ch1.charAt(i+j)!=ch2.charAt(j)) { 
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