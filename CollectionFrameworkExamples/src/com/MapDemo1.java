package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		Map mm1 = new HashMap();
		Map mm2 = new LinkedHashMap();
		Map mm3 = new TreeMap();
		Map mm4 = new Hashtable();
		
		mm1.put(2, "Lex");
		mm1.put(1, "Ajay");
		mm1.put(3, "Steven");
		mm1.put("Abc", "Neena");
		System.out.println(mm1);
		
		mm2.put(2, "Lex");
		mm2.put(1, "Ajay");
		mm2.put(3, "Steven");
		mm2.put("Abc", "Neena");
		System.out.println(mm2);
		
		mm3.put(2, "Lex");
		mm3.put(1, "Ajay");
		mm3.put(3, "Steven");
		//mm3.put("Abc", "Neena"); //in tree map all keys must be of the same type
		System.out.println(mm3);
		
		mm4.put(2, "Lex");
		mm4.put(1, "Ajay");
		mm4.put(3, "Steven");
		mm4.put("Abc", "Neena"); //in tree map all keys must be of the same type
		System.out.println(mm4);

	}

}
