package com.techlabs.test;

import com.techlabs.model.BoxWeight;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoxWeight boxWeight=new BoxWeight();
		
		boxWeight.setDepth(20);
		boxWeight.setHeight(20);
		boxWeight.setWeigth(50);
		boxWeight.setWidth(12);
		
		System.out.println(boxWeight.getDepth());
		System.out.println(boxWeight.getHeight());
		System.out.println(boxWeight.getHeight());
		System.out.println(boxWeight.getWidth());
		

	}

}
