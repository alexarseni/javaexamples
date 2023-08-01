package singleton;

class Employee{
	int id;
	private static Employee emp = new Employee(); //only one object will be created no matter how many times we call 
	//the getInstance method. We also make it private so that it is mandatory to call the getInstance method to create a reference
	//of this object.
	private Employee() {
		
	}
	public static Employee getInstance() {
		//in a static method we cannot access non-static variables.
		return emp;
	}
	
	public void display() {
		System.out.println("Display method and id is "+id);
	}
}

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = Employee.getInstance();
		emp1.id = 10;
		Employee emp2 = Employee.getInstance();
		emp2.id = 20; //only one instance exists, but many references`
		emp1.display();
		emp2.display();
		//Employee emp3 = Employee.emp; //creates an error because the object is private
		//emp3.display();
	}

}
