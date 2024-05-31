package com.techlabs.test;

import com.techlabs.model.Point;

public class PointTest {

	public static void main(String[] args) {
		Point point1=new Point();
		System.out.print("Point1 :");
		System.out.println("("+point1.getX()+","+point1.getY()+")");
		point1.setX(10);
		point1.setY(20);
		System.out.println("("+point1.getX()+","+point1.getY()+")");
		
		Point point2=new Point(point1);
		System.out.print("Point2 :");
		System.out.println("("+point2.getX()+","+point2.getY()+")");// copying value of point 1 to point2
		point2=point1;// Referring to point 1,both have same hashcode
		System.out.println("("+point2.getX()+","+point2.getY()+")");
		
		Point point3=new Point(50,60);
		System.out.print("Point3 :");
		System.out.println("("+point3.getX()+","+point3.getY()+")");
		
	}

}
