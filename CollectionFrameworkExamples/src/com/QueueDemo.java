package com;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue q1 = new LinkedList(); //interface Queue, class linkedList
		//this way we will call only the methods corresponding to the queue interface
		//not the methods corresponding to the List interface
		Queue q2 = new PriorityQueue();
		
		
		q1.add(3);
		q1.add(1);
		q1.add(4);
		q1.add(5);
		q1.add(4);
		
		q2.add(3);
		q2.add(1);
		q2.add(4);
		q2.add(5);
		q2.add(4);
		
		
		//The linkedList queue maintains the insertion order
		System.out.println("LinkedList queue: "+q1);
		
		//PriorityQueue automatically orders the elements based on priority
		System.out.println("PriorityQueue: "+q2);
		q1.poll();
		q2.poll();
		System.out.println("First poll");
		System.out.println(q1+"\n"+q2);
		
		q1.poll();
		q2.poll();
		System.out.println("Second poll");
		System.out.println(q1+"\n"+q2);
		
	}

}
