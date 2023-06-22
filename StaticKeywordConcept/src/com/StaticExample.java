package com;

public class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj1 = new Abc();
		obj1.a = 100; //instance variable
		Abc.b = 200; //static variable, call it directly through the class
		
		obj1.dis1(); //non static method
		Abc.dis2(); //static method through class
		
		obj1.dis2(); //static method through object
		obj1.b = 300; //static variable through object
		System.out.println("---------------");
		
		Employee emp1 = new Employee(); //heap memory
		Employee emp2 = new Employee(); //heap memory
		emp1.name = "Lex";
		emp1.salary = 45000;
		emp1.managerId = 124;
		emp1.disEmpInfo();
		emp2.disEmpInfo(); //managerid is a static variable , so all objects of the employee class will have the same managerid.
	}

}
