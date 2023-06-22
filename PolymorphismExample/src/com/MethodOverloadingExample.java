package com;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation op = new Operation(); //create object
		op.add(10);
		op.add(10.10,20.20);
		op.add(10,20);
		op.add("some","thing");
		
	}

}
