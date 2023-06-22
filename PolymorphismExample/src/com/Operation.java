package com;

public class Operation {
	void add () {  //same name but different number of parameters
		System.out.println("No paramaters: ");
		System.out.println(10+20);
	}
	
	void add(int x) {
		System.out.println("One parameter: ");
		System.out.println(x+100);
	}
	
	void add(int x, int y) {
		System.out.println("Two int parameters: ");
		System.out.println(x+y);
	}
	
	void add(double x, double y) { //same name but different type of parameters
		System.out.println("Two double parameters: ");
		System.out.println(x+y);
	}
	
	void add(String x, String y) {
		System.out.println("Two string parameters: ");
		System.out.println(x+y);
	}
}

