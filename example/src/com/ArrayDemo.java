package com;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1[] = {10,20,30,40,50};
		System.out.println(num1); //displays the address of the array, unlike java
		System.out.println("Size of array " + num1.length);
		
		for (int i=1, n=10; i<=n; i++) {
			System.out.println("i = " +i);
		}
		
		for (int i=0; i<num1.length; i++) {
			System.out.println("Array value is "+num1[i]);
		}
	}

}
