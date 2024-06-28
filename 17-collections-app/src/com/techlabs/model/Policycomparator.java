package com.techlabs.model;

import java.util.Comparator;

public class Policycomparator {
	public static class PolicyByName implements Comparator<Insurancepolicy>{

		@Override
		public int compare(Insurancepolicy o1, Insurancepolicy o2) {
			
			return o1.getPolicyHolderName().compareTo(o2.getPolicyHolderName());
		}
		
	}
	public static class PolicyByAmount implements Comparator<Insurancepolicy>{

		@Override
		public int compare(Insurancepolicy o1, Insurancepolicy o2) {
			
			return (int) (o1.getPolicyAmount()-o2.getPolicyAmount());
		}
		
	}
	public static class PolicyByCreationDate implements Comparator<Insurancepolicy>{

		@Override
		public int compare(Insurancepolicy o1, Insurancepolicy o2) {
			
			return o1.getPolicyCreationDate().compareTo(o2.getPolicyCreationDate());
//			int year1= Integer.parseInt(o1.getPolicyCreationDate().substring(6));
//			int year2=Integer.parseInt(o2.getPolicyCreationDate().substring(6));
//			if(year1!=year2) return year1-year2;
//			
//			int month1= Integer.parseInt(o1.getPolicyCreationDate().substring(3,5));
//			int month2=Integer.parseInt(o2.getPolicyCreationDate().substring(3,5));
//			if(month1!=month2) return month1-month2;
//			
//			int date1= Integer.parseInt(o1.getPolicyCreationDate().substring(0,2));
//			int date2=Integer.parseInt(o2.getPolicyCreationDate().substring(0,2));
//			
			
		}
		
	}
}
