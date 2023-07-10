package Demo;

import java.util.Scanner;
public class QuizProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//created scanner object to read user's input
		Scanner sc = new Scanner(System.in);
		//declare the variable tha will hold user's answer
		int n;
		//Display question and options
		System.out.println("who is the founder of Blue origin?");
		System.out.println("1. Bill Gates\n2. Tim Cook\n3. Nadella\n4. Jeff Bezos");
		//read user input
		n = sc.nextInt();
		sc.close();
		
		if (n ==4) {
			System.out.println("Correct!");
		}
		else {
			System.out.println("Wrong choice!");
		}
		
	}

}
