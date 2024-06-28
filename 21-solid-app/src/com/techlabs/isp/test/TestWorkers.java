package com.techlabs.isp.test;

import com.techlabs.isp.violation.IWorker;
import com.techlabs.isp.violation.Labour;
import com.techlabs.isp.violation.Robot;

public class TestWorkers {

	public static void main(String[] args) {
		IWorker labour=new Labour();
		labour.startWork();
		labour.stopWork();
		labour.eat();
		labour.drink();

		IWorker robot=new Robot();
		robot.startWork();
		robot.stopWork();
		robot.eat();
		robot.drink();
	}

}
