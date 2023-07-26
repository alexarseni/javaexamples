package com;

class Booking implements Runnable {
	//in this scenario, only one ticket is available
	int av1 =1;

	@Override
	//if the method is declared as synchronized, once the first thread enters the 
	//method, no other thread will be allowed to start the execution of the method's
	//code. Lex will always get the ticket
	public synchronized void run() {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		String name = t.getName();
		//the problem is that if the threads are checking simultaneously the
		//value of av1, they will all get the ticket. We need to control the use
		//of the resources, so that only one thread at a time can access av1.
		
		if (av1==1) {
			System.out.println(name + " got the ticket");
			av1--;
		}
		else {
			System.out.println(name + " sorry, no ticket");
		}
		
	}	
}

public class BookingApp {

	public static void main(String[] args) {
		// Only one booking is available
		Booking b1 = new Booking();
		//Booking b2 = new Booking();
		//Booking b3 = new Booking();
		
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b1);
		Thread t3 = new Thread(b1);
		
		t1.setName("Lex");
		t2.setName("Vijay");
		t3.setName("Nina");
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
