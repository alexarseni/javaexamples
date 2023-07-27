package com;

import java.util.HashSet;
import java.util.Set;

public class RetrieveValueFromCollection {

	public static void main(String[] args) {
		// array value retrieve using enhanced loop or for each loop
		//similar to pyhton's notation
		
		int abc[] = {10,20,30,40};
		System.out.println(abc); //because this is a normal array, the output will
		//be the memory address. if it was a collection framwork object
		//the output would a list of the contents
		
		for (int n:abc) { //if it was an array of floats for (float f:abc)
			System.out.println(n);
		}
		Set ss = new HashSet();
		ss.add(10);
		ss.add(40);
		ss.add("Ravi");
		ss.add(7.3);
		System.out.println(ss); //displays all the elements
		
		for (Object hs:ss) { //now we need to write the object keyword
			//because we have a collection framework object
			//not an array of primitive type
			System.out.println(hs);
		}
		
	}

}
