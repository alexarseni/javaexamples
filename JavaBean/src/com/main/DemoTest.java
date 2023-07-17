package com.main;
//import com.bean.Product; //this is the prefered method to import from other packages
import com.bean.*;    //the star imports all classes inside the com.bean package
//this will affect performance if the package has a substantial amount of classes
//import java.util.Scanner;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product(); //we are getting an error because we have define a parameter constructor in the product class
		//so we must provide values for the object, or explicitly define the default constructor
		Product p1 = new Product(101,"Computer",2000);
		//Scanner sc = new Scanner(System.in);
		
		p.setPid(100);
		p.setPname("TV");
		p.setPrice(4500);
		
		System.out.println("Get pid "+p.getPid());
		System.out.println("Get pname "+p.getPname());
		System.out.println("Get price "+p.getPrice());
		
		System.out.println("Get pid "+p1.getPid());
		System.out.println("Get pname "+p1.getPname());
		System.out.println("Get price "+p1.getPrice());
		
		System.out.println(p);
		System.out.println(p1.toString());
		
	}

}
