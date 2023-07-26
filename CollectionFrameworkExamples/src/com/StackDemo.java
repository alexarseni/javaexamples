package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack ss = new Stack();
		ss.push(10);
		ss.push(20);
		ss.push(30);
		ss.push(40);
		System.out.println(ss);
		ss.pop(); //last element inserted will be removed
		System.out.println(ss);
		System.out.println("Peek "+ss.peek()); //displays last element inserted/ top element
		System.out.println("Search "+ss.search(20));
		//search displays the position from the top, that the element is found.
		//if the element does not exist in stack, the return value will be negative
		System.out.println("Search "+ss.search(60));
	}

}
