package com.techlabs.test;

import com.techlabs.model.MyThread;

public class MyThreadDemo {

	public static void main(String[] args) {
		
		MyThread thread1=new MyThread("MyThread1");
		MyThread thread2=new MyThread("MyThread2");
		MyThread thread3=new MyThread("MyThread3");
		thread3.setPriority(10);
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread1.setPriority(Thread.NORM_PRIORITY);
		
		
//		for(int i=1;i<4;i++) {
//			System.out.println(Thread.currentThread().getName()+" : "+i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}

}
