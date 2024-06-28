package com.techlabs.model;

public class Caller implements Runnable {
	public String message;
	public Callme target;
	public Thread thread;
	
	
	public Caller(String message, Callme target) {
		super();
		this.message = message;
		this.target = target;
		this.thread = new Thread(this);
		thread.start();
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(target) {
		target.call(message);
		}
		
	}

}
