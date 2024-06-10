package com.techlabs.test;

import com.techlabs.exception.AgeNotValidException;
import com.techlabs.model.Voter;

public class TestVote {

	public static void main(String[] args) {
		
		try {
		Voter voter1=new Voter("Deepak",20);
		
		Voter voter2=new Voter("Rahuk",10);
		voter1.vote();
		voter2.vote();
		}
		catch(AgeNotValidException e) {
			System.out.println(e.getMessage());
		}

	}

}
