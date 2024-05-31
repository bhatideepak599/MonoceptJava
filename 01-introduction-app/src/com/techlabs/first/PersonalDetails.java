package com.techlabs.first;

import java.util.Random;
import java.util.Scanner;
import java.util.HashSet; 
import java.util.Set; 

public class PersonalDetails {

	public static void main(String[] args) { 
		  Scanner scanner=new Scanner(System.in); 
		  System.out.println("Enter size of array"); 
		  int n=scanner.nextInt(); 
		  int array[]=new int[n]; 
		  System.out.println("Enter values in to array"); 
		  for(int i=0;i<n;i++) { 
		   array[i]=scanner.nextInt(); 
		  } 
		  int[] nums=null; 
		  
		  if(pairAverage(array)) { 
		   System.out.println("true"); 
		    
		  } 
		  else { 
		   System.out.println("false"); 
		  } 
		 } 
		 public static boolean pairAverage(int n[]) { 
		  if(n.length<2) { 
		   return false; 
		  } 
		  int sum=0; 
		   
		  for(int i:n) { 
		   sum+=i; 
		  } 
		  
		  if(sum%n.length!=0) return false;
		  int average=(int)(sum /n.length); 
		 
		  
		  Set<Integer> pair=new HashSet<>(); 
		  for(int i:n) { 
		   if(pair.contains(average - i)) { 
		    return true; 
		   } 
		   pair.add(i); 
		   
		  } 
		  return false; 
		  
		 } 

}
