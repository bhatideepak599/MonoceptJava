package com.techlabs.test;

import com.techlabs.model.InputValidator;

public class TestInputs {

	public static void main(String[] args) {
		
		InputValidator ip=new InputValidator();
		
		System.out.println(ip.checkEmail(""));
	}

}
