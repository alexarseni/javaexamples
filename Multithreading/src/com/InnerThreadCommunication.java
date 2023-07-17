package com;
class Work implements Runnable {
	@Override
	public synchronized void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
	try {
		for(int i=0;i<=10;i++) {
			System.out.println(name+" "+i);
			if(i==5 && name.equals("Ajay")) {
				wait();
			}
			if(i==6 && name.equals("Vijay")) {
				notify();
				wait();
			}
			Thread.sleep(1000);
		}
	} catch (Exception e) {
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