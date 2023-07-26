package com;

class Task implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for (int i = 0; i<=1000;i++) {
			System.out.println(name+" "+i);
		}
	}	
}

public class OneClassMoreThanOneThread {

	public static void main(String[] args) {
		Task obj1 = new Task(); //each client will receive one thread
		//The threads share the same resources and the code of the Task
		//eg onine shopping
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj1);
		Thread t3 = new Thread(obj1);
		
		t1.setName("ravi");
		t2.setName("ajay");
		t3.setName("vijay");
		
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
