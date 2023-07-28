package abc;

import java.util.Arrays;

public class ArraysDemo {
	
	public static void main(String[] args) {
		
		int num[] = {3,1,6,9,2,5,7};
		String names[] = {"Vijay", "Ajay", "Ramesh", "Leela", "Neena"};
		System.out.println("Display elements before sort: ");
		for (int n:num) {
			System.out.print(n+ " ");
		}
		Arrays.sort(num);
		System.out.println("\nDisplay elements after sort: ");
		for (int n:num) {
			System.out.print(n+ " ");
		}
		
		Arrays.sort(names);
		System.out.println("\nDisplay elements after sort: ");
		for (String n:names) {
			System.out.print(n+ " ");
		}
		
	}
	

}
