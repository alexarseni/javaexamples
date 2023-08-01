package factory;

class Loan{
	public void calculate() {
		System.out.println("Rate of interest is 0.5%");
	}
}

class CarLoan extends Loan{
	public void calculate() {
		System.out.println("Rate of interest is 1.2%");
	}
}

class HomeLoan extends Loan{
	public void calculate() {
		System.out.println("Rate of interest is 0.8%");
	}
}

class LoanFactory {
	public static Loan getTypeOfLoan(String type) { //static so that we can call it without creating object
		//of factory class
		if(type.equalsIgnoreCase("home")) {
			return new HomeLoan();
		}
		else if(type.equalsIgnoreCase("car")) {
			return new CarLoan();
		}
		else return null;
	}
}

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan ll = LoanFactory.getTypeOfLoan("Car");
		ll.calculate();

	}

}
