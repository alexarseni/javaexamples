package com;

public class RuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		int res[] = {100,200,300};
		int a = 10, b=0;
		try {
		int result = a/b;
		int result1 = 100/res[5];
		
		System.out.println("Result "+result); //we will get arithmetic exception because of the divison by zero
		System.out.println("Result "+result1);
		}catch(Exception e) {
			System.out.println("we are catching any  type ofexception");
			//System.out.println(e.getMessage());
		//	System.out.println(e.getCause());
			//System.out.println(e.getClass());
			System.out.println(e.toString()); //name fo the exception and message
		}
		System.out.println("Bye");
	}

}
