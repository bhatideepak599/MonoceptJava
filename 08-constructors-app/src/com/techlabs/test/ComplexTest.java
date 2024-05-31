package com.techlabs.test;

import com.techlabs.model.Complex;

public class ComplexTest {

	public static void main(String[] args) {
		Complex complex1=new Complex(5,6);
		Complex complex2=new Complex(7,6);
		Complex complex3=new Complex();
		
		
		System.out.println("1st Complex Number: "+complex1.getX()+"+"+complex1.getY()+"i");
		System.out.println("2nd Complex Number: "+complex2.getX()+"+"+complex2.getY()+"i");
		
		complex3=complex3.addComplex(complex1, complex2);
		System.out.println("1st Complex Number: "+complex1.getX()+"+"+complex1.getY()+"i");
		System.out.println("After Addition: "+complex3.getX()+"+"+complex3.getY()+"i");
		
	}

}
