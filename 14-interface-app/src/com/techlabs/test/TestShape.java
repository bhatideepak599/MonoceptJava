package com.techlabs.test;

import com.techlabs.model.Circle;
import com.techlabs.model.Rectangle;
import com.techlabs.model.Shape;

public class TestShape {

	public static void main(String[] args) {
		Shape rectangle=new Rectangle(4,5);
		
		Shape circle=new Circle(14);
		
		rectangle.area();
		rectangle.perimeter();
		
		circle.area();
		circle.perimeter();

	}

}
