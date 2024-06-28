package com.techlabs.test;

import com.techlabs.model.Consumer;
import com.techlabs.model.Producer;
import com.techlabs.model.Q;

public class TestProducerConsumer {

	public static void main(String[] args) {
		
		Q q=new Q();
		Producer producer1=new Producer(q);
		Consumer consumer1=new Consumer(q);
		
		

	}

}
