package Week2;

public class MultiplicationTable {

	public static void main(String[] args) {

		System.out.println(" %  0  1  2  3  4  5  6  7  8  9  10");
		System.out.println(" 0  0  0  0  0  0  0  0  0  0  0   0");
		System.out.println(" 1  0  1  2  3  4  5  6  7  8  9  10");
		System.out.println(" 2  0  2  4  6  8 10 12 14 16 18  20");
		System.out.println(" 3  0  3  6  9 12 15 18 21 24 27  30");
		
		int topNumber = 0;
		//int sideNumber = 0;
		
		
		for (topNumber = 0; topNumber <= 10; topNumber++) {
			System.out.print("  " + topNumber);
		}
		
		System.out.println();
		for (topNumber = 0; topNumber <=10; topNumber++) {
			System.out.print("  " + topNumber*1);
		}
		
		System.out.println();
		for (topNumber = 0; topNumber <=10; topNumber++) {
			if (topNumber*2 <10) {
			System.out.print("  " + topNumber*2);	
			} else {
				System.out.print(" " + topNumber*2);
			}
		}
		
}}

