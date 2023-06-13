package com;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int num1[] = {10,20,30,40,50};
		System.out.println(num1); //displays the address of the array, unlike java
		System.out.println("Size of array " + num1.length);
		
		for (int i=1, n=10; i<=n; i++) {
			System.out.println("i = " +i);
		}
		
		for (int i=0; i<num1.length; i++) {
			System.out.println("Array value is "+num1[i]);
		}
*/		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to store?");
		int size = sc.nextInt();
		int abc[] = new int [size];
		int sum = 0;
		
		System.out.println("Please enter the 10 numbers one by one");
		for (int i = 0; i<abc.length; i++) {
			abc[i] = sc.nextInt();
			sum += abc[i];
		}
		System.out.println("The sum of the numbers you have entered is "+sum);
		sc.close();
		
	}

}
