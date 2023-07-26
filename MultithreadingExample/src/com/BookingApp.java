package com;

class Booking implements Runnable {
	int av1 =1;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		String name = t.getName();
		if (av1==1) {
			System.out.println(name + " got the ticket");
			av1--;
		}
		else {
			System.out.println("sorry, no ticket");
		}
		
		
	}	
}

public class BookingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booking b1 = new Booking();
		Booking b2 = new Booking();
		Booking b3 = new Booking();
		
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b2);
		Thread t3 = new Thread(b3);
		
		t1.setName("Lex");
		t2.setName("Vijay");
		t3.setName("Nina");
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
