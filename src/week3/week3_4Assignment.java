package week3;

import java.util.Arrays;

public class week3_4Assignment {

	public static void main(String[] args) {

//Exercise 1		
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 45, 61, 89, 95 };
	
		int ageDifference = ages[ages.length - 1] - ages[0];
		System.out.println("Age difference: " + ageDifference);
			
		int agesSum = 0;			
		for (int a = 0; a < ages.length; a++) {
			agesSum += ages[a];
		}
		double agesAverage = agesSum/ages.length;
		System.out.println("Average Age: " + agesAverage);

//Exercise 2		
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		double sum0 = 0;
		for (String name : names) {
			sum0 += name.length();
		}
		double nameLengthAvg = sum0 / names.length;
		System.out.println("Average of name lengths: " + nameLengthAvg);		
		
		System.out.println("Names concatenated:");
		for (String n : names) {
			System.out.print(n + " ");
		}

//Exercise 3
		//names[names.length - 1];
		
//Exercise 4
		//names[0];
		
		System.out.println("");
		
//Exercise 5
		int[] nameLengths = new int[names.length];
		for (int a = 0; a < names.length; a++) {
			nameLengths[a] = names[a].length();
//			System.out.println(nameLengths[a] + " ");
		}
		System.out.println("Length of each string: " + Arrays.toString(nameLengths));

//Exercise 6
		int sum = 0;
		for (int length : nameLengths) {
			sum = sum + length;
		}
		System.out.println("Sum of string lengths: " + sum);

//Exercise 7.1
		System.out.print("Repeated word: "); 
		userWordRepeated("remote", 5);

		System.out.println("");

//Exercise 8.1
		System.out.println("Full Name: " + fullName("Felicia", "Hagan"));
		
//Exercise 9.1		
		System.out.println("Is sum greater than 100? " + sumGreater100(nameLengths));
		
//Exercise 10.1	
		double[] doublesForAvg = { 3.0, 8.9, 6.7, 2.3, 4.5 };
		System.out.println("Average 1: " + averageOfDoubles(doublesForAvg));
		
//Exercise 11.1
		double[] doublesForAvg2 = { 1.2, 3.2, 8.0, 7.2 };
		System.out.println("Average 2: " + averageOfDoubles(doublesForAvg2));
		System.out.println("Average 1 is greater than Average 2? " + compareAverages(doublesForAvg, doublesForAvg2));
	
//Exercise 12.1
		System.out.println("Will I buy a drink? " + willBuyDrink(true, 1.00));

//Exercise 13.1
		System.out.print("Are you making coffee today? ");	
		System.out.println(makingCoffee(false, true, true));
	}
	
//Exercise 7.0
	public static String userWordRepeated(String word, int num) {
		for (int i = 1; i <= num; i++) {
			System.out.print(word);
		}
		return word;
	}

//Exercise 8.0
	public static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
//Exercise 9.0
	public static boolean sumGreater100(int[] intArray) {
		int sum = 0;
		for (int b = 0; b < intArray.length; b++) {
			sum = sum + intArray[b];
		}
		return sum > 100;
	}
	
//Exercise 10.0
	public static double averageOfDoubles(double[] doubleArray) {
		double sum = 0;
		for (int c = 0; c < doubleArray.length; c++) {
			sum = sum + doubleArray[c];
		}
		double avg = sum / doubleArray.length;
		return avg;
	}
	
//Exercise 11.0
	public static boolean compareAverages(double[] double1, double[] double2) {
		double sum1 = 0;
		for (double i : double1) {
			sum1 += sum1 + i;
		}
		double avg1 = sum1 / double1.length;
		
		double sum2 = 0;
		for (double j : double2) {
			sum2 += sum2 + j;
		}
		double avg2 = sum2 / double2.length;
		
		return avg1 > avg2;
	}
	
//Exercise 12.0
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
//Exercise 13.0
	public static String makingCoffee(boolean haveCoffee, boolean haveSyrup, boolean haveCream) {
		String coffeeToday = "";
		if (haveCoffee == false || haveSyrup == false || haveCream == false) {
			coffeeToday = "I can't make coffee. I need to go to the grocery.";
		} else {
			coffeeToday = "Yes, I am making coffee. Want some?";
		}
		return coffeeToday;
	}
	
}
