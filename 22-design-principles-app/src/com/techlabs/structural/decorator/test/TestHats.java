package com.techlabs.structural.decorator.test;

import com.techlabs.structural.decorator.model.GoldenHat;
import com.techlabs.structural.decorator.model.RibonedHat;
import com.techlabs.structural.decorator.model.StandardHats;

public class TestHats {

	public static void main(String[] args) {
		StandardHats standard=new StandardHats();
		System.out.println(standard.getName());
		System.out.println(standard.getPrice());
		System.out.println(standard.getDescription());
		
		
		System.out.println("--------------------");
		GoldenHat goldenStandardHat=new GoldenHat(standard);
		System.out.println(goldenStandardHat.getName());
		System.out.println(goldenStandardHat.getPrice());
		System.out.println(goldenStandardHat.getDescription());
		
		System.out.println("--------------------");
		
		
		RibonedHat goldenStandardRibbonHat=new RibonedHat(goldenStandardHat);
		System.out.println(goldenStandardRibbonHat.getName());
		System.out.println(goldenStandardRibbonHat.getPrice());
		System.out.println(goldenStandardRibbonHat.getDescription());

	}

}
