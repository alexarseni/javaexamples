package abc;

public class MethodOverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda hh = new Honda();
		hh.color();
		hh.speed(); //the method inside the honda class is being called. 
		//which method will be used is decided on runtime based on the object that called the method
		Pulsar pu = new Pulsar();
		pu.color();
		pu.speed(); //the pulsar class does not have a speed method, so the method of the Bike class is used
	}
}
