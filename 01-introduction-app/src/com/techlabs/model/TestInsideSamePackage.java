package com.techlabs.model;

public class TestInsideSamePackage {
	
	
	public static void main(String args[]) {
		ProtectedAccessSpecifier protectedAccessSpecifier=new ProtectedAccessSpecifier();
		System.out.println(protectedAccessSpecifier.x);
		protectedAccessSpecifier.display();
	}
	
	
}
