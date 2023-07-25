package com;

public class CheckedException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		//try {
			//sleep throws InterruptedException. This is an exception that 
			//sleep throws when another thread interrupts the current thread 
			//while sleep is active. the exception must either be caught, or 
			//the method should declare that it throws an exception.
			Thread.sleep(5000);
		//}catch(Exception e) {
			//System.out.println("Something");
		//}
		System.out.println("Take tea break...");

	}

}
