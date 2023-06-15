package a;

public class EmployeeTest {
	
	public static void main (String[] agrs) {
		Employee emp1 = new Employee(); //the constructor will be called automatically
		Employee emp2 = new Employee();
		Employee emp3 = new Employee(43,"maria",3000); //add values through parameter constructor
		
//		emp1.id = 100; //add values by accessing parameters directly
//		emp1.name = "lex"; //only available if the paramters of the class are not set as private
//		emp1.salary = 12000;
//		emp1.display();
		
		emp2.set_value(100, "alexandra", 1300); //using set_value method
		emp2.display();
		emp3.display();
		emp1.set_value(56, "dimitra", -3000);
		emp1.display();
	}
}
