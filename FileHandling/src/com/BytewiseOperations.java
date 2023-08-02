package com;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
		
		//source: keyboard
		//destination: file
		//FileOutputStream fos = new FileOutputStream("abc.txt");  //if the file does not exist, it will create it
		FileOutputStream fos = new FileOutputStream("abc.txt", true);//appends at the end of the file
		//if it does exist, it will override it
		System.out.println("Please enter the data");
		int ch;
		while((ch = dis.read()) != '@') {
			System.out.println(ch+ "=" + (char)ch);
			fos.write(ch);
		}
		fos.close();
		System.out.println("Data stored in file");
		
		FileInputStream fi = new FileInputStream("abc.txt");
		int data = fi.read(); //will read first character
		System.out.println("The byte read is "+ (char)data);
		
	}

}
