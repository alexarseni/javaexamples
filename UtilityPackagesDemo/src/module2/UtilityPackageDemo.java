package module2;
import java.util.*;
import java.util.function.*; //we need both of these imports

class MyConsumer<T> implements Consumer<T>{
	public void accept(T ctask) {
		System.out.println("Working on the number "+ ctask);
		System.out.println("Result after adding 5 to the number "+ ((int)(ctask)+5));
	}
}

public class UtilityPackageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList mylist;
		
		MyConsumer mcons;
		
		mylist = new ArrayList<>(5);
		mcons = new MyConsumer();
		
		mylist.add(100);
		mylist.add(200);
		mylist.add(300);
		mylist.add(400);
		
		mylist.forEach(mcons);
		
	}

}
