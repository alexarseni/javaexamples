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
		System.out.println();
		
		//To use binary search elements need to have been sorted first.
		int num2[] = {8,10,3,7,3,1,12}; //{1,3,3,7,8,10,12}
		
		System.out.println("\nDisplay elements before sort: ");
		for (int n:num2) {
			System.out.print(n+ " ");
		}
		//this answer will be wrong
		System.out.println("\nSearch Result before sorting:");
		System.out.println(Arrays.binarySearch(num2, 1)); //wrong answer
		//to use binary search the array must first be sorted
		
		Arrays.sort(num2);
		System.out.println("Search Result after sorting:");
		System.out.println(Arrays.binarySearch(num2, 1)); //right answer
		
		if(Arrays.binarySearch(num2, 20)<0) {
			System.out.println("Not present");
		}
		else {
			System.out.println("Element present");
		}
		String name1 = "Alex", name2 = "Maria";
		System.out.println(name1.compareTo(name2));//anything other than 0 menas the str
		System.out.println(name1.codePointAt(0));
		
	}
	

}
