package com;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		System.out.println("Before\n"+hs.size()); //predefined methods
		System.out.println(hs.isEmpty());
		hs.add(10); //we are adding without worrying about type or size of the set
		hs.add(5.6);
		hs.add(true);
		System.out.println("After\n"+hs.size()); //predefined methods
		System.out.println(hs.isEmpty());
		System.out.println(hs); //displays all elements, but in a different order
		//than the one I added the elements
		hs.remove(10); //we can also remove using the value of the element 
		//we want removed
		System.out.println(hs);
		
		
		
	}
}
