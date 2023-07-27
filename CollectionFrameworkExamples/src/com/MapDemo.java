package com;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		//HashMap hm = new HashMap(); //also possible
		Map hm = new HashMap(); //interface map, class Hashmap, good practice
		hm.put(2, "Lex");
		hm.put(1, "Steven");
		hm.put(3, "Raju");
		System.out.println(hm);
		hm.put(1,"Neena"); //f the key already exists, the value is replaced by default.
		//not good!
		System.out.println(hm);
		//we should first search whether a particular key exists, before trying to insert
		//data
		//search for key
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsKey(0));
		
		//search for value
		System.out.println(hm.containsValue("Lex"));
		System.out.println(hm.containsValue("Maria"));
		
		System.out.println(hm.get(2)); //get value of key 2
		
		hm.remove(3); //remove the pair with key 3
		System.out.println(hm);
		
	}

}
