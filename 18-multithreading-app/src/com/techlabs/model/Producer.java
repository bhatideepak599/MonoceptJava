package com.techlabs.model;

public class Producer implements Runnable {
	 Q q;
	 
	 public Producer(Q q) {
	 this.q = q;
	 new Thread(this, "Producer").start();
	 }
	 public void run() {
	 int i = 0;
	 while(i<10) {
	 q.put(i++);
	 }
	 }
}	 
	 
	 
