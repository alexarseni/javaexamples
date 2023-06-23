package com;

public class RuntimeError {
	public static void main (String[] args) {
	System.out.println("hi");
	int a=10;
	int b = 0;
	try {
	int res = a/b; //WILL CREATE RUNTIME ERROR - ARITHMETIC EXCEPTION
	System.out.println("result is" +res);
	}
	catch(Exception e) {
		System.out.println(e.getMessage()); //EXCEPTION MESSAGE IN SHORT
	}
	System.out.println("THIS WILL BE EXECUTED BECAUSE WE CAUGHT THE EXCEPTION");
	}

}
