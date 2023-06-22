package abc;

public class Honda extends Bike{ //Honda is a type of bike. single inheritance
	//Honda has two methods on its own, and also inherits the speed method from the Bike class
	void color() {
		System.out.println("Gray");
	}
	
	void speed() {
		System.out.println("50km/hr");
	}
}
