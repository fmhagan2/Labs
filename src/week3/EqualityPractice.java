package week3;

public class EqualityPractice {
	
	public static void main (String [] args) {
		
		int[] grades = { 100, 100, 100 };

		Student student1 = new Student("Molly Mack", grades);   //false, false, false, true; assuming grades have influence
		Student student2 = new Student("Molly Mack", grades);
		
		//String student1 = new String("Molly Mack");  //false, true, true, NA
		//String student2 = new String("Molly Mack");
		
		
		System.out.println("student1 vs. student2 Equality Example:");
		System.out.println("---------------------------------------");
		System.out.println("Is student1 == student2? " 
		                    + (student1 == student2));
		System.out.println("Is student1.equals(student2)? " 
		                    + (student1.equals(student2)));
		System.out.println("Is student1.equals(\"Molly Mack\")? " 
		                    + (student1.equals("Molly Mack")));
		System.out.println("Is student1.fullName.equals(\"Molly Mack\")? " 
		                    + (student1.fullName.equals("Molly Mack")));
		
//		
//		Student student3 = student2;
//
//		System.out.println("student2 vs. student3 Equality Example:");
//		System.out.println("---------------------------------------");
//		System.out.println("Is student2 == student3? " 
//		                    + (student2 == student3));
//		System.out.println("Is student2.equals(student3)? " 
//		                    + (student2.equals(student3)));

		
	}

}
