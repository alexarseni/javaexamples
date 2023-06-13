package abc;

public class MethodExample {
	
	static void display() {
		System.out.println("This is a display method");
	}
	
	static void add(int x, int y) {
		int sum = x+y;
		System.out.println("sum of two numbers is "+sum);
	}
	
	static int findLargest(int x, int y) {
		if(x>y) {
			return x;
		}
		else {
			return y;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		add(100,200);
		int result = findLargest(5,3);
		System.out.println("The largest number is "+result);
	}

}
