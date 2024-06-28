package com.techlabs.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.techlabs.model.Task;

public class TestTask {

	public static void main(String[] args) {
		
		int count=Runtime.getRuntime().availableProcessors();
		System.out.println(count);
		//ExecutorService service=Executors.newFixedThreadPool(10);
		  ExecutorService service=Executors.newCachedThreadPool();
		
		for(int i=0;i<100;i++) {
			service.execute(new Task());
		}
	}

}
