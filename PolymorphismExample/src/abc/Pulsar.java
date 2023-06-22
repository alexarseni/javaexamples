package abc;

public class Pulsar extends Bike {
	void color() {
		System.out.println("Black");
	}
	@Override //annotation, only for conformation purposes, not mandatory
	void speed() {
		System.out.println("90km/hr");
	}
}
