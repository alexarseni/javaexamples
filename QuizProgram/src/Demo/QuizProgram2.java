package Demo;

import java.util.Scanner;

public class QuizProgram2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//created scanner object to read user's input
		Scanner sc = new Scanner(System.in);
		//declare the variable tha will hold user's answer
		int n;
		
		while (true) {
			//Display question and options
			System.out.println("who is the founder of Blue origin?");
			System.out.println("1. Bill Gates\n2. Tim Cook\n3. Nadella\n4. Jeff Bezos\n5.Exit Program");
			//read user input
			n = sc.nextInt();
			if (n ==4) {
				System.out.println("Correct!");
				break;
			}
			else if (n == 5) {
				System.out.println("Exiting...");
				break;	
			}
			else {
				System.out.println("Wrong choice, try again!");
			}
		}	
		sc.close();	
	}

}
