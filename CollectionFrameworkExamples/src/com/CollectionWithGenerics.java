package com;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithGenerics {

	public static void main(String[] args) {
		// Collection without generics -we can store any value!!!
		//Storing is easy, but retrieving becomes complicated
		List ll = new ArrayList();
		ll.add(10); //auto-boxing: converting primitive to object automatically
		ll.add(7.3);
		ll.add("Ravi");
		Object obj = ll.get(0); //because of autoboxing, in order to retrieve the 
		//initially primitive values, we need to save them in an object, not a primitive variable
		//even if the initial inserted value was a simple int.
		
		//in order to get back a primitive value that has been made into an object
		//we need to typecast. Example for int:
		Integer i = (Integer)obj; //the generic object is now an Integer object
		int n = i.intValue(); //the Integer object is now a primitive int variable
		System.out.println(n);
		
		//To be able to retrieve easily, we need to declare what type of elements
		//will be stored in the collection framework
		//List<Type> ll = new ArrayList<Type>();
		//Type can be Integer, Float, Character, Boolean, Double, String
		//or user defined object
		List<Integer> li = new ArrayList<Integer>();
		li.add(5);
		li.add(20); //auto-boxing also happens here
		//li.add("Ravi");// this will create an error, because we have declared
		//Integers will be stored here.
		//Now that retrieving becomes easy, because we have auto-unboxing
		int num = li.get(0);
		System.out.println(num);
	}

}
