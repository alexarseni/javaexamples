package a;

public class Employee {
	private int id;
	private String name;
	private float salary;
	
	//empty constructor
	Employee(){  //must have same name as class, no return type, no need to call it
		System.out.println("Object Create");
		id = 123;  //for all objects created through the empty constructor id will be 123
		name = "something";
		salary= 5000;		
	}
	//parameter constructor
	Employee(int id1, String name1, int salary1){  //must have same name as class, no return type, no need to call it
		System.out.println("Object Create");
		id = id1;
		name = name1;
		if (salary1>0)
		{		
			salary= salary1;		
		}
		else {
			salary = 8000;
		}
	}
	
	void display() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
	
	void set_value(int id1, String name1, float salary1) {
		id = id1;
		name = name1;
		if (salary1>0)
		{		
			salary= salary1;		
		}
		else {
			salary = 8000;
		}
	}
}
