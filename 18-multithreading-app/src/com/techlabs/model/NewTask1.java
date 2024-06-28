package com.techlabs.model;

import java.util.Random;
import java.util.concurrent.Callable;

public class NewTask1 implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		
		return new Random().nextInt();
	}

}
