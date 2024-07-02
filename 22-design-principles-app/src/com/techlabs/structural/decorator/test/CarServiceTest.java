package com.techlabs.structural.decorator.test;

import com.techlabs.structural.decorator.model.CarInspection;
import com.techlabs.structural.decorator.model.OilChange;
import com.techlabs.structural.decorator.model.WeelAlign;

public class CarServiceTest {

	public static void main(String[] args) {
		CarInspection carInspection = new CarInspection();
		System.out.println(carInspection.getCost());

		OilChange carInspectionwithOilChange = new OilChange(carInspection);

		System.out.println(carInspectionwithOilChange.getCost());

		WeelAlign carInspectionwithOilChangeAndWeelAlign = new WeelAlign(carInspectionwithOilChange);
		System.out.println(carInspectionwithOilChangeAndWeelAlign.getCost());

	}

}
