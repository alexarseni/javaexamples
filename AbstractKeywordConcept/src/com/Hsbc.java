package com;

public class Hsbc extends Bank{
	
	//because the withdraw method is abstract in the super class
	//it is mandatory that all subclasses implement the method
	@Override
	void withdraw() {
		System.out.println("Withdraw common logic by HSBC");
	}
}
