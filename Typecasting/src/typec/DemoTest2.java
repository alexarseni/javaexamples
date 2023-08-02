package typec;
class A {
	void dis1() {
		System.out.println("A class dis1 method");
	}
	void dis3() {
		
		System.out.println("Exists only in class A");
	}
}

class B extends A {
	void dis1() {
		System.out.println("B class dis1 method");
	}
	
	void dis2() {
		System.out.println("B class dis2 method");
	}
}

public class DemoTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1 = new A(); //superclass object
		B obj2 = new B(); //subclass object
		
		//B obj3 = new A(); // creating superclass object with a subclass reference/type is not possible
		A obj4 = new B(); //creating subclas method with a superclass reference/type is possible
		obj4.dis1(); // only overriden methods or methods that exist in class A will be accessible through
		//object B. Other class B methods will be hidden. Possible because of inheritance
		obj4.dis3();
		//obj4.dis2(); we het the error "dis2() is undefined for type A
		
		//B obj5 = obj4;  even thoigh obj4 is a class B object it is of type A, so we need to typecast
		B obj5 = (B)obj4;
		obj5.dis1(); //now we can call all methods
		obj5.dis2();
		obj5.dis3();
		
		//Be default all classes extend the Object class
		
		A obj6 = new A();
		Object obj7 = new A(); //superclass type, A class object. this object has now idea about the native methods
		//of class A
		
		obj6.dis1();
		A obj8 = (A)obj7; //We need to typecast if we want to access the other methods.downlevel typecasting
		obj8.dis1();
	
	}

}
