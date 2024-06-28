package com.techlabs.test;

import com.techlabs.model.Caller;
import com.techlabs.model.Callme;

public class CallerTest {

	public static void main(String[] args) {
		Callme target=new Callme();
		Caller thread1=new Caller("Hello",target);
		Caller thread2=new Caller("Bhenji",target);
		Caller thread3=new Caller("Didi ji",target);
		
		try {
			thread1.thread.join();
			thread2.thread.join();
			thread3.thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
