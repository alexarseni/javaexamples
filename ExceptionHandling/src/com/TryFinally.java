package com;

public class TryFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		int a=10;
		int b = 0;
		try {
			int res = a/b;
			System.out.println("No exception");
		} finally {
			// TODO: handle finally clause, this will be executed even if an exception is raised. since there is no
			//catch block to handle the exception, after the execution of the finally block, the execution of the rest
			//code will not be executed
			System.out.println("Finally block");
		}
		System.out.println("Finish");
	}

}
