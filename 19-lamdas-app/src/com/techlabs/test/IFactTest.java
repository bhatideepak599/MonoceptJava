package com.techlabs.test;

import com.techlabs.model.IFact;

public class IFactTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFact iFact= (int number)-> {
			int ans=1;
			for(int i=1;i<=number;i++) ans*=i;
			return ans;
		};
		
		System.out.println(iFact.fact(5));
	}

}
