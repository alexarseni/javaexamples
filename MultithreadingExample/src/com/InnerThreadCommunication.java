package com;

class Work implements Runnable {

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		String name = t.getName();
		try {
			for (int i = 0; i<=10;i++) {
				System.out.println(name+" "+i);
				if (i==5 && name.equals("Ajay") ) {
					wait(); //suspends the thread forever unless someone else
					//wakes it up
				}
				
				if(i==6 && name.equals("Vijay")) {
					notify(); //wakes up any suspended thread
					wait();
				}
				if(i==7&& name.equals("Lokesh")) {
					notify();
				}
	
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class InnerThreadCommunication {

	public static void main(String[] args) {
		Work ww = new Work();
		Thread t1 = new Thread(ww);
		Thread t2 = new Thread(ww);
		Thread t3 = new Thread(ww);
		
		t1.setName("Ajay");
		t2.setName("Vijay");
		t3.setName("Lokesh");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
