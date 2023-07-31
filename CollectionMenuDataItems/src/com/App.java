package com;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentService();
		String con;
		int choice;
		int key;
		do {
			System.out.println("Please choose\n1.Add Student 2. Number of Students 3. Student Information 4. Student Info One By One 5. Key approach");
			System.out.println("6. Search data with key 7. Remove data with key");
			choice = sc.nextInt();
			switch(choice) {
			case 1: ss.addStudent();
					break;
			case 2: ss.numberOfStudents();
					break;
			case 3: ss.displayStudentInformation();
					break;
			case 4: ss.displayStudentOneByOne();
					break;
			case 5: ss.getOnlyKeys();
					break;
			case 6: System.out.println("Please give me the key ");
					key = sc.nextInt(); //I am asking for the value in the main method, usually the case
					ss.searchDataUsingKey(key);
					break;
			case 7: System.out.println("Please give me the key ");
					key = sc.nextInt(); //I am asking for the value in the main method, usually the case
					ss.removeDataUsingKey(key);
					break;
			default: System.out.println("Wrong choice");
			}
			
			System.out.println("Do you want to continue?");
			con = sc.next();
		}while(con.equalsIgnoreCase("y"));
		sc.close();
		
		System.out.println("the end");
	}

}
