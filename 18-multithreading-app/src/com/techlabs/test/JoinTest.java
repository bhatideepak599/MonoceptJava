package com.techlabs.test;

import com.techlabs.model.NewThread;

public final class JoinTest {

	public static void main(String[] args) {
		NewThread thread1=new NewThread("t1");
		NewThread thread2=new NewThread("t2");
		NewThread thread3=new NewThread("t3");
		
		System.out.println(thread1.thread.isAlive());
		System.out.println(thread2.thread.isAlive());
		System.out.println(thread3.thread.isAlive());
		
		
		
		for(int i=3;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+": "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			thread1.thread.join();
			thread2.thread.join();
			thread3.thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(thread1.thread.isAlive());
		System.out.println(thread2.thread.isAlive());
		System.out.println(thread3.thread.isAlive());
		
		System.out.println("Exiting main");
	}

}
