package com;
import java.util.Scanner;

public class TakeValueFromKeyboard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //create scanner object
		System.out.println("Enter the value of a ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b ");
		int b = sc.nextInt(); //predefined method, there is one for each datatype
		sc.close();
		int sum = a+b;
		System.out.println("The sum of the two numbers is "+sum);

	}

}
