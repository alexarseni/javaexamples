package com;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =0;
		int b=1;
		try {
			int res = a/b;
			System.out.println("No exception");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		finally {
			System.out.println("Finally block");
		}
		
		System.out.println("Finish");
	}

}
