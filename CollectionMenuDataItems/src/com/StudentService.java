package com;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StudentService {
	//Map<Integer, String> stdnames = new HashMap<Integer, String>(); //reminder HAshmap does not maintain insertion order
	//you can use any type of map for this example application
	Map<Integer, String> stdnames = new TreeMap<Integer,String>();
	
	//we will take the values through the keyboard
	Scanner sc = new Scanner(System.in); //object sc will be taking input from System.in
	
	//first business method
	public void addStudent() {
		try {
			System.out.println("Enter student ID");
			int id = sc.nextInt(); //this expects one int and an enter key
			//if we enter an alphanumerical value, it will create an exception
			sc.nextLine(); //read the rest of the line in case the user added trash
			System.out.println("Enter name");
			String name = sc.next(); //the prompt will be presents until you hit enter, but the string will be saved until the first spacebar
			
			if (stdnames.containsKey(id)){
				System.out.println("Key must be unique");
			}
		
			else {
				stdnames.put(id, name);
				System.out.println("Information inserted successfully");
			}
		}
		catch(Exception e) {
			//the flow will jump here
			System.out.println("Id must be of type int");
			sc.nextLine(); // Read the rest of the line
		}
		
	}
	//second business method
	public void numberOfStudents() {
		System.out.println("Number of student details "+stdnames.size());
	}
	//third business method
	public void displayStudentInformation() {
		System.out.println(stdnames);
	}
	
	//fourth business method- remember there is not iterator in map, we need to create a set 
	public void displayStudentOneByOne() {
		Set<?> ss = stdnames.entrySet(); //converting map to set. with set we can use the iterator or the foreach loop
		Iterator<?> ii = ss.iterator();
		while(ii.hasNext()) {
			Object std = ii.next(); //the first time we execute ii.next, it retrieves the first of the elements.
			System.out.println(std);
		}
	}
	
	public void getOnlyKeys() {
		Set<?> ss = stdnames.keySet(); //converting map to set. set of keys only
		Iterator<?> ii = ss.iterator();
		while(ii.hasNext()) {
			Object key = ii.next(); //the first time we execute ii.next, it retrieves the first of the elements.
			System.out.println(key+" "+ stdnames.get(key)); //display the record that corresponds to this key
		}
	}
}
