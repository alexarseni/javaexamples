package com;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		/*ArrayList al = new ArrayList();
		System.out.println("Size "+al.size());
		al.add(10);
		al.add(10.6);
		al.add("Alexandra");
		al.add(true);
		System.out.println("Size "+al.size());*/
		ArrayList al = new ArrayList();
		
		al.add("Lex");
		al.add("Steven");
		al.add("John");
		System.out.println(al);
		System.out.println("Size "+ al.size());
		System.out.println("Get 0 index value "+al.get(0));
		System.out.println("Get 1 index value "+al.get(1));
		//System.out.println("try to get a wrong index "+al.get(5));
		al.add("Raju"); //will add at the ends
		al.add(1, "Neena"); //"Neena" in index position 1. polymorphism of the add method
		System.out.println(al);
		al.remove("Lex");//remove by value
		al.remove(2);//we can also remove by index position
		System.out.println(al);
	}

}
