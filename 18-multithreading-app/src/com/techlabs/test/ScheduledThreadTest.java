package com.techlabs.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.techlabs.model.Task;

public class ScheduledThreadTest {

	public static void main(String[] args) {
		
		ScheduledExecutorService service= Executors.newScheduledThreadPool(5);
		
		service.schedule(new Task(),5, TimeUnit.SECONDS);
		
		//service.scheduleAtFixedRate(new Task(), 2, 4, TimeUnit.SECONDS);
		
		

	}

}
