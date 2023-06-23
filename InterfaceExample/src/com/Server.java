package com;

public class Server implements Team1,Team2 {
	public int add(int x, int y) { //THE INTERFACES DONT KNOW THE LOGIC
		return x+y;
	}
	
	public int sub(int x,int y) {
		return x-y;
	}
	
	public void ownMethod() {
		System.out.println("Server own method");
	}
	
}
