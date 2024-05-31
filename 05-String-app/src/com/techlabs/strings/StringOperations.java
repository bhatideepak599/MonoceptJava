package com.techlabs.strings;

public class StringOperations {

	public static void main(String[] args) {
		String s1=new String("Deepak");
		StringBuffer  s2=new StringBuffer("Bhati");
		StringBuilder s3=new StringBuilder("last");
		
		concat1(s1);
		System.out.println(s1);
		concat2(s2);
		System.out.println(s2);
		concat3(s3);
		System.out.println(s3);
	}

	private static void concat3(StringBuilder s3) {
		s3= s3.append("Deepak");
		
	}

	private static void concat2(StringBuffer s2) {
		s2= s2.append("Deepak");
		
	}

	private static void concat1(String s1) {
		s1= s1+"Bhati";
		
	}

}
