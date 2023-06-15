package com;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.setEmployee(100, "Steven", 1500);
		System.out.println("======================");
		System.out.println("Employee details:");
		emp1.disEmployee();
		System.out.println("======================");
		System.out.println("======================");
		Manager mgr1 = new Manager();
		mgr1.setEmployee(101, "Lex", 4500);
		mgr1.setManager(15);
		System.out.println("Manager details:");
		mgr1.disEmployee();
		mgr1.disManager();
		System.out.println("======================");
		System.out.println("======================");
		
		System.out.println("Dev has employee details and dev details:");
		Developer dev1 = new Developer();
		dev1.setEmployee(102, "Neena", 2800 );
		dev1.setDeveloper("Java");
		dev1.disEmployee();
		dev1.disDeveloper();
		System.out.println("======================");
	}

}
