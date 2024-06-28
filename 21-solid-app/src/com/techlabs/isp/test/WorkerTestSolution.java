package com.techlabs.isp.test;

import com.techlabs.isp.solution.IWorker;
import com.techlabs.isp.solution.Ilabour;
import com.techlabs.isp.solution.Labour;
import com.techlabs.isp.solution.Robot;

public class WorkerTestSolution {

	public static void main(String[] args) {
		Ilabour robot=new Robot();
		robot.startWork();
		robot.stopWork();
		System.out.println();
		IWorker labour=new Labour();
		labour.startWork();
		labour.stopWork();
		labour.eat();
		labour.drink();

	}

}
