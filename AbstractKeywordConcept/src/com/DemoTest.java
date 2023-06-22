package com;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bank bb = new Bank(); will create error, because Bank is abstract
		Hsbc obj1 = new Hsbc();
		obj1.withdraw(); //abstract and implemented
		obj1.deposit(); //not overriden
		Sbi obj2 = new Sbi();
		obj2.withdraw();
		obj2.deposit();
		
	}

}
