package com;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StudentService {
	//Map<Integer, String> stdnames = new HashMap<Integer, String>(); //reminder HAshmap does not maintain insertion order
	//you can use any type of map for this example application
	Map<Integer, String> stdnames = new TreeMap<Integer,String>();
	
	//we will take the values through the keyboard
	Scanner sc = new Scanner(System.in); //object sc will be taking input from System.in
	
	//first business method
	public void addStudent() {
		System.out.println("Enter student ID");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		if (stdnames.containsKey(id)){
			System.out.println("Key must be unique");
		}
		else {
			stdnames.put(id, name);
			System.out.println("Information inserted successfully");
		}
	}
	//second business method
	public void numberOfStudents() {
		System.out.println("Number of student details "+stdnames.size());
	}
	
	
	
}
