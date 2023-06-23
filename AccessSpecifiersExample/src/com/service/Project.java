package com.service;
import com.bean.*;

public class Project {
	Employee emp = new Employee();
	public void empDetails() {
		//System.out.println(" Id "+emp.id);		// private : scope same class. 
		//System.out.println(" Name "+emp.name);	// default : within a same package. 
		//System.out.println(" Salary "+emp.salary);	// protected can't access because project is not a subclass of employeee
		System.out.println(" Designation "+emp.designation);
	}
}
