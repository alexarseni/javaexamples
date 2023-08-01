package prototype;

class Employee implements Cloneable{
	double salary;
	public void display() {
		System.out.println("Salary is "+salary);
	}
	public Employee getClone() {
		try {
			Object obj = clone(); //the clone method is predefined from the object class and throws exception CloneNotSupported
			//it returns an object of type Object
			Employee e = (Employee)obj; //downlevel typecasting: create an Employee object from the super class Object
			//the class that we want to have the cloning functionality, we need to declare that it implements Clonable
			return e;
		}
		catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
}

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();//1st object
		Employee emp2 = new Employee();//2nd object\
		Employee emp3 = emp1; //here emp3 and emp1 refer to the same object/memory not cloning
		
		emp1.salary = 1200;
		emp2.salary = 1400;
		emp3.salary = 1600;
		
		emp1.display();
		emp2.display();
		emp3.display();
		
		Employee emp4 = emp2.getClone();
		System.out.println("after the creation of the clone");
		emp4.display();
		emp2.display();
		emp2.salary = 1500;
		emp4.display();
		emp2.display();
		
		

	}

}
