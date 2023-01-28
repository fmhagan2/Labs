package week4;

import java.util.Set;
import java.util.HashSet;

public class collections_practice {
	public static void main (String[] args) {
		String name = "Bob Brown";
		System.out.println(name);
		name = "Sue Brown";
		System.out.println(name);
		
		Set<String> vegetables = new HashSet<String>();

		vegetables.add("Carrot");
		System.out.println(vegetables);
		vegetables.add("Onion");
		System.out.println(vegetables);
		vegetables.add("Broccoli");
		System.out.println(vegetables);
		vegetables.add("Asparagus");
		System.out.println(vegetables);

	}

}
