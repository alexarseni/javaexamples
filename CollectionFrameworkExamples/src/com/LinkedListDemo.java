package com;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40); //adding elements is fast
		ll.add(1,15);
		System.out.println(ll);
		ll.addFirst(1);
		ll.add(60);
		System.out.println(ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		ll.remove(5);
		System.out.println(ll);

	}

}
