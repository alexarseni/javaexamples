package com;

public class Demo implements Abc,Xyz {
	public void dis1() {  //MUST BE PUBLIC
		System.out.println("this is Abc interface through demo");
	}
	
	public void dis2() {  //MUST BE PUBLIC
		System.out.println("this is Xyz interface through demo");
	}

}
