package com.bean;

public class Employee {
	private int id; //PRIVATE
	String name; //DEFAULT
	protected float salary;
	public String designation;
	
	public void empInfo() {
		System.out.println("id "+id);
		System.out.println("name " +name);
		System.out.println("salary " +salary);
		System.out.println("designaion " +designation);
		
	}
}
