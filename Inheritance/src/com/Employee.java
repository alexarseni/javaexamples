package com;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	
	//using id1, name1 etc is not good practice since for each emp there is only one id anyway
	//
	void setEmployee(int id, String name, int salary ) {
		this.id = id; //this.id is instance variable and id is local variable
		this.name = name;
		this.salary = salary;
	}
	void disEmployee() {
		//System.out.println("Employee details");
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
