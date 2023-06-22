package com;

public abstract class Bank {
	
	//void withdraw() {
		//System.out.println("Withdraw common logic");
		//this code will never be used because both hsbc and sbi class override it
		//to avoid situations like this we can declare the method and class as abstract
	//}
	
	abstract void withdraw();
	void deposit() {
		System.out.println("a deposit");
	}
}
