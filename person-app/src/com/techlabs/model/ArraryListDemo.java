package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraryListDemo {

	public static void main(String[] args) {
		
		List<Person> persons=new ArrayList<Person>();
		
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.print("Enter The Person"+(i+1)+" Name:");
			String name=scanner.next();
			

			System.out.print("Enter Age:");
			int age=scanner.nextInt();
			

			System.out.print("Enter Address of person:");
			String address=scanner.next();
			persons.add(new Person( name, age,address));
		}
		
		System.out.println(persons);
		Person person1=new Person("abc",22,"xyz");
		persons.add(0,person1);
		System.out.println("List after adding a person at the beginning of the list.");
		System.out.println(persons);
		Person person2=new Person("xyz",21,"abc");
		persons.add(person2);
		System.out.println("List after adding a person at the end of the list.");
		System.out.println(persons);
		Person person3=new Person("def",22,"ghf");
		persons.add(3,person3);
		System.out.println("List after adding a person at the Third of the list.");
		System.out.println(persons);
		
		System.out.print("Details of Person at 5th Position:");
		System.out.println(persons.get(4));
		
		System.out.println("Details of 1st Person in the List:");
		System.out.println(persons.get(0));
		
		System.out.println("Details of last Person in the List:");
		System.out.println(persons.get(persons.size()-1));
		
		System.out.println("Changing the  details of 2nd Person.");
		System.out.print("Enter Age:");
		int age=scanner.nextInt();
		System.out.print("Enter Address of person:");
		String address=scanner.next();
		persons.get(1).setAddress(address);
		persons.get(1).setAge(age);
		
		System.out.println("Details After Updation.");
		System.out.println(persons.get(1));
		persons.remove(0);
		System.out.println("Details After Removing 1st Person.");
		System.out.println(persons);
		persons.remove(2);
		System.out.println("Details After Removing 3rd Person.");
		System.out.println(persons);
		System.out.println();
		System.out.println("Searching.......");
		isPresent(scanner,persons);
		
	    System.out.println("Traversing over the list.");
		traverse(persons);
		System.out.println();
		System.out.println("Clearing the list...");
		persons.clear();
		
		System.out.println(persons);
		
		
		
		
		
	}

	private static void traverse(List<Person> persons) {
		for(Person person:persons) {
			System.out.println(person);
		}
		
	}

	private static void isPresent(Scanner scanner, List<Person> persons) {
		
		System.out.print("Enter The Person Name:");
		String name=scanner.next();
		System.out.print("Enter Age:");
		int age=scanner.nextInt();
		int count=0;
		for(Person person:persons) {
			count++;
			if(person.getName().equals(name) && person.getAge()==age) {
				System.out.println("Person is present at "+count+" Index.");
				return;
			}
		}
		System.out.println("Person is not present.");
	}
	

}
