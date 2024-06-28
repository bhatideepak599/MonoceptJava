package com.techlabs.isp.solution;

public class Labour implements Ilabour, IWorker {

	@Override
	public void startWork() {
		System.out.println("Labour starts working...");

	}

	@Override
	public void stopWork() {
		System.out.println("Labour stops working...");
	}

	@Override
	public void eat() {
		System.out.println("Labour is eating...");

	}

	@Override
	public void drink() {
		System.out.println("Labour is drinking...");

	}

}
