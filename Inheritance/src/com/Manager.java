package com;

public class Manager extends Employee {
	private int numberOfEmp;
	
	void setManager(int numberOfEmp) {
		this.numberOfEmp = numberOfEmp;
	}
	void disManager() {
		//System.out.println("Manager information");
		System.out.println("Number of Employees is "+this.numberOfEmp);
	}
}
