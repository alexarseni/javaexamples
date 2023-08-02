package com;

import java.io.DataInputStream;
import java.io.PrintStream;

public class BytewiseOperations {

	public static void main(String[] args) throws Exception {
		//source: keyboard
		//destination: console
		//type: bytewise
		
		//Scanner sc = new Scanner(System.in); 
		DataInputStream dis = new DataInputStream(System.in); //like using scanner class, our source is System.in ie
		//the keyboard
		
		PrintStream ps = System.out;
		ps.println("Enter the name");
		String name = dis.readLine(); //deprecated and exception
		ps.println("Name is "+name);
	}

}
