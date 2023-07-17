package com.main;
//import com.bean.Product; //this is the prefered method to import from other packages
import com.bean.*;    //the star imports all classes inside the com.bean package
//this will affect performance if the package has a substantial amount of classes
//import java.util.Scanner;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		//Scanner sc = new Scanner(System.in);
		
		p1.setPid(100);
		p1.setPname("TV");
		p1.setPrice(4500);
		
		System.out.println("Get pid "+p1.getPid());
		System.out.println("Get pname "+p1.getPname());
		System.out.println("Get price "+p1.getPrice());
		
	}

}
