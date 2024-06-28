package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.techlabs.model.NewTask1;

public class TestCallable {

	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(5);
		
		List<NewTask1> list=new ArrayList<NewTask1>();
		list.add(new NewTask1());
		list.add(new NewTask1());
		list.add(new NewTask1());
		list.add(new NewTask1());
		list.add(new NewTask1());
		//Future<Integer> f=service.submit(new NewTask1());
	
			List<Future<Integer>> l=new ArrayList<Future<Integer>>();
			
		

	}

}
