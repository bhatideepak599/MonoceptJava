package com.techlabs.model;

public class NewThread implements Runnable {

	
	public Thread thread;
	
	public NewThread(String name) {
		
		this.thread = new Thread(this,name);
		thread.start();
	}

	public void run() {
		for(int i=1;i<4;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
