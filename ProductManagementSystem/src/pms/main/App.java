package pms.main;


import java.util.List;
import java.util.Scanner;

import pms.service.ProductService;

import pms.bean.*;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductService ps =new ProductService(); //we need a service object to acess the services
		int pid;
		String pname; //temporary variables to get the product information
		float price;
		String con;
		int choice;
		String result;
	
		do {
			System.out.println("1. Add product\n2. Number of products\n3. Remove Element\n4. Update product\n5. Display all products");
			choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.println("Add product");
			System.out.println("Enter product ID");
			pid = sc.nextInt(); //we are getting user input in the main method, as per the coding standards
			
			System.out.println("Enter the product name");
			pname = sc.next();
			
			System.out.println("Enter product price");
			price = sc.nextFloat();
			
			Product p = new Product(pid,pname,price); //created the product object, but haven't saved it in our list
			result = ps.storeProduct(p); //store the return value of the storeProduct method
			System.out.println(result);
			break;
			
			case 2: System.out.println("Number of products");
			System.out.println(ps.numberOfProduct());
			break;
			
			case 3: System.out.println("Please insert product pid");
			pid = sc.nextInt();
			System.out.println(ps.deleteProduct(pid));
			break;
			
			case 4: System.out.println("Enter product ID");
			pid = sc.nextInt(); //we are getting user input in the main method, as per the coding standards
			
			System.out.println("Enter product's new price");
			price = sc.nextFloat();
			
			Product p1 = new Product();
			p1.setPid(pid);
			p1.setPrice(price);
			
			System.out.println(ps.updateProduct(p1));
			break;
			
			case 5:
			List<Product> saved_products = ps.displayAllProducts();
			for(Product sp:saved_products) {
				System.out.println(sp);
			}
			break;
			
			default : System.out.println("Wrong choice");
			break;
			}
			System.out.println("do you want to continue?");
			con = sc.next();
		
		}while(con.equalsIgnoreCase("y"));
		sc.close();
		System.out.println("Thank you!");
	}
}