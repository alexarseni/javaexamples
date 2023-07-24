package com;

public class RuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		int a = 10, b=0;
		try {
		int result = a/b;
		System.out.println("Result "+result); //we will get arithmetic exception because of the divison by zero
		}catch(Exception e) {
			System.out.println("we are catching any exception");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getClass());
			System.out.println(e.toString());
		}
		System.out.println("Bye");
	}

}
