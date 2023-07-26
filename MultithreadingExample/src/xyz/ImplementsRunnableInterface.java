package xyz;

class A implements Runnable {
	@Override
	//it is mandatory to override the run method, because it is part of the interface
	public void run() {
		//create a thread object to view the name of the current thread
		Thread t = Thread.currentThread();
		System.out.println(t);
		for (int i = 0; i<=1000;i++) {
			System.out.println("i "+i);
		}
	}
}

class B implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
		for (int j = 0; j<=1000;j++) {
			System.out.println("j "+j);
		}
	}
}

public class ImplementsRunnableInterface {

	public static void main(String[] args) {
		// now objects A and B, are regular objects, not thread objects, since
		//the classes don't extend the Thread class.
		A obj1 = new A();
		B obj2 = new B();
		
		//To give life to the thread, we need to call the start method. The Runnable
		//interface ONLY has the run method. So we cannot call the start method 
		//since it doesnt exist.
		//obj1.start()
		
		//We need to create a Thread class object, and pass the runnable interface 
		//object (obj1, obj2) as a parameter in the Thread constructor
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		//now we can call start through the thread objects
		
		t1.start();
		t2.start();
	}

}
