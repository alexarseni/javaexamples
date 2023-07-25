package com;

//inorder to create a custom exception we need to create a separate class

class VoteException extends Exception {
	
	public VoteException() {
		
	}
	//if we want a custom message for this exception, we need to 
	//create a parameter constructor
	public VoteException(String msg) {
		super(msg); //we are calling the superclass's constructor and passing the messsage aas an argument
		//so the the parent class' parameter constructor is actually called
	}
}

public class Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 15;
		try {
		if (age<21) {
			//this will generate a generic exception, the user does not know what went wrong
			//throw new Exception();
			//This way you can let the use know why the exception was raised
			//throw new Exception("You can't vote since you are younger than 21");
			//predefined exception, custome message
			//throw new ArithmeticException("You cannot vote");
			throw new VoteException("You can't vote");
			//anything inside this if, underneath the exception is
			//considered unreachable code
			//System.out.println("Will this be printed?");
		}
		else {
			System.out.println("You can vote");
		}
		}catch (Exception e) {
			//toString() is the default method, even if you call e by itself
			//e.toString will be called. 
			System.out.println(e.toString());
			System.out.println("Exception caught successfully");
		}
		
		System.out.println("Finish");
	}

}
