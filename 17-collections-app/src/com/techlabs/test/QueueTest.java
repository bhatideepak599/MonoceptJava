package com.techlabs.test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
//		Queue<Integer> queue=new PriorityQueue<Integer>();
//		
		Deque<Integer> queue=new LinkedList<Integer>();
		//Deque<Integer> queue=new ArrayDeque<Integer>();
	
		queue.add(79);
		queue.add(23);
		queue.add(22);
		
		queue.addFirst(1000);
		System.out.println(queue);
		queue.poll();
		System.out.println(queue.peek());
		System.out.println(queue);
		

	}

}
