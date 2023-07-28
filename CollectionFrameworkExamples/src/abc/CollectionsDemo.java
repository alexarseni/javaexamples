package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(2); ll.add(3); ll.add(1); ll.add(4);
		
		System.out.println("Before sort");
//		for (int number:ll) { //classic wayto display elements that works with primitives arrays as well
//			System.out.println(number);
//		}
		System.out.println(ll); //because this is a collection we can directly print
		Collections.sort(ll);
		System.out.println("after sort and ascending");
		System.out.println(ll);
		
		Collections.reverse(ll);
		System.out.println("After reverse");
		System.out.println(ll);
		
		

	}

}
