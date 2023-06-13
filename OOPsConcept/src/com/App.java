package com;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in order to call methods from the car class, i first need to create an instance (object) of that class
		
		Car car1 = new Car();
		Car bmw = new Car();
		car1.start();
		bmw.stop();
		
		System.out.println("Car details");
		car1.wheel = 4;
		car1.colour = "Gray";
		System.out.println("The colour of the car is "+car1.colour);
		System.out.println("The car has "+car1.wheel +" wheels");
				
	}

}
