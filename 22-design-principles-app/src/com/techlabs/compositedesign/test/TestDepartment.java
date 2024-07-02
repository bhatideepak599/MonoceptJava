package com.techlabs.compositedesign.test;

import com.techlabs.compositedesign.model.Department;
import com.techlabs.compositedesign.model.HeadDepartment;
import com.techlabs.compositedesign.model.ItDepartment;
import com.techlabs.compositedesign.model.SaleDepartment;

public class TestDepartment {

	public static void main(String[] args) {
		Department itDepartment=new ItDepartment("ITDepartment", 1);
		Department salesDepartment=new SaleDepartment("SalesDepartment", 2);
		HeadDepartment headDepartment=new HeadDepartment("HeadDepartment", 3);
		
		headDepartment.addDepartment(itDepartment);
		headDepartment.addDepartment(salesDepartment);
		
		headDepartment.printDepartmentName();
		
		

	}

}
