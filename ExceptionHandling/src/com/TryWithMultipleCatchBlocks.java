package com;

public class TryWithMultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		int a = 10, b = 0;
		int abc[] = {100,200,300};
		try {
			int res1 = a/b;
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
			
		}
		try {
			int res2 = 100/abc[5];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		
		System.out.println("Caught both exceptions!!");

	}

}
