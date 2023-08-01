package staticfactory;

class Employee {
	private Employee() { //private constructor == we cannot create objects of the class outside of the class
	}
	
	public void display() {
		System.out.println("this is employee class public method");
	}
	//this is the method that the outside world will use to create objects of the Employee class
	//Because it is a static method, we can directly call it with the name of the class.
	public static Employee getInstance() {
		Employee emp = new Employee(); //this method exists inside the class Employee, so it is allowed 
		//to create objects of that class. 
		//by using a method to create objects, we have more control over what objects are created
		int code = 1; //here is an example code for what the logic could be.
		if(code==1) {
			return emp;
		}else return null;
	}
}

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee emp = new Employee(); //not possible since the Employee constructor is private and we are outside the Employee class.
		//emp.display
		
	}

}
