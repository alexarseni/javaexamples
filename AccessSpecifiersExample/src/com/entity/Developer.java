package com.entity;
import com.bean.*;

public class Developer extends Employee {
	public void devInfo() {
		//System.out.println("Id " +id); PRIVATE SCOPE
		//System.out.println("Name "+name);
		System.out.println("Salary "+salary); //developer is a subclass of employee so it can access protected information
		System.out.println("Designation "+designation);
	}
}
