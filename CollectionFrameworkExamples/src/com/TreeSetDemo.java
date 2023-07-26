package com;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		ts.add(1);
		ts.add(6);
		ts.add(5);
		ts.add(3);
		System.out.println(ts.headSet(5)); //print until you find the element
		//with alue 5, without that element itself
		System.out.println(ts.tailSet(5));//print from the element with value 5
		//including it
		System.out.println(ts.subSet(1, 5));//including 1 excluding 5
		System.out.println(ts);
		

	}

}
