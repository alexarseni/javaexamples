package abc;

class A extends Thread{
	@Override
	//it is not mandatory to override the run method, because itexists in the super class
	public void run() {
		//super.run(); this calls the run method of the super class ie the thread class
		for (int i = 0; i<=10;i++) {
			System.out.println("i "+i);
		}
	}
}

class B extends Thread{
	@Override
	public void run() {
		//super.run();
		for (int j = 0; j<=10;j++) {
			System.out.println("j "+j);
		}
	}
}

public class ExtendsthreadClassExample {

	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		//if these start methods were non-thread methods, they would be
		//executed sequentially ie. the first one would finish before the
		//second one started. threads DONT need to wait. 
		obj1.start(); //after calling the start method, the thread goes into 
		//the runnable state - ready to run
		obj2.start(); //threads don't need to wait for the other to complete
	}
}
