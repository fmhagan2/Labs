package week3;

import java.util.Scanner;

public class Array_Method_Labs {
    public static void main(String[] args) {
    	
    	int[] numArray = { 1, 5, 2, -2, 8, 13, 6 };
    	
    	System.out.println(numArray[0]);
    	System.out.println(numArray[numArray.length - 1]);
    	//System.out.println(numArray[numArray.length + 1]);		//Index out of bounds
    	//System.out.println(numArray[-1]);							//Index out of bounds
    	
    	for (int y = 0; y < numArray.length; y++) {
    		System.out.println(numArray[y]);
    	}
    	
    	for (int x : numArray) {
    		System.out.println(x);
    	}
    	
    	double sum = 0;
    	for (int x : numArray) {
    		sum = sum + x;
    	}
		System.out.println(sum);

		double avg = sum/numArray.length;
    	System.out.println(avg);
    	
    	
    	for (int x : numArray) {
    		if (x%2 == 0) {
    			
    		} else {
    			System.out.println(x);
    		}
    	} 	
 	    	
  ///////////////////////////////////////////////////  	
    	    	
    	String[] nameArray = { "Sam", "Sally", "Thomas", "Robert" };
    	
    	int sumNames = 0;
    	for (String a : nameArray) {
    		sumNames = sumNames + a.length();
    	}
    	System.out.println(sumNames);
    	
  /////////////////////////////////////////////////////  	
    	
    	greet("Kevin");
    	greet("Melanie");
    	
    	System.out.println(greet2("Joe"));
    	
    	String greetA = greet2("Amber");
    	System.out.println(greetA);
    	
   /////////////////////////////////////////////////////
    	    	
    	System.out.println("Number of letters greater than number? " + numVsLetters("Coffee", 8));
    	
   ////////////////////////////////////////////////////
    	
    	String[] strArr = { "Cat", "Dog", "Fish", "Elephant", "Giraffe", "Seal", "Whale", "Deer", "Zebra" };
    	
    	System.out.println("Is String In Array? " + isStringInArray(strArr, "Bear"));
    	System.out.println("String In Array? " + isStringInArray(strArr, "Dog"));
    	
   //////////////////////////////////////////////////
    	
    	//Name of int array above: numArray
    	System.out.println("Smallest Number is Array: " + smallestNumInArray(numArray));
    	
   ///////////////////////////////////////////////////
    	
    	double[] arrayOfDoubles = { 5.5, 6.7, 2, -13.8, 94 };
    	System.out.println("Average of Doubles: " + getAvg(arrayOfDoubles));
    	
   ////////////////////////////////////////////////////
    	
    	//Name of animal array above: strArr
    	System.out.println("Length of Each String in Array: ");
    	int [] strArrLengths = lengthOfEachString(strArr);
    	for ( int f : strArrLengths) {
    		System.out.print( f + " " );
    	}
    	
   /////////////////////////////////////////////////////////////////////
    	System.out.println();
    	System.out.println("There are more even word letters: " + sumEvenGreater(strArr));
    	
   ///////////////////////////////////////////////////
    	    	
    	System.out.println("Enter word: ");
      	Scanner word = new Scanner(System.in);
    	String wordToSeeIfPalindrome = word.nextLine();
    	System.out.println("Word is a palindrome: " + isWordPalindrome(wordToSeeIfPalindrome));
    	word.close();
    	//How to repeat entering words until isWordPalindrome == true?
    }
    
//////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
    
    public static void greet (String name) {
		System.out.println("Greetings," + name + "!");
	}
    
    public static String greet2 (String name) {
    	//no print
    	return "Sup, " + name + "?";
    }
    
    public static boolean numVsLetters (String word, int num) {
    	return word.length() > num;
    }
    
    public static boolean isStringInArray (String[] stringArray, String word) {
    	for (String b : stringArray) {
    		if (b.equals(word)) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public static int smallestNumInArray (int[] intArray) {
    	int smallest = intArray[0];
    	for (int c : intArray) {
    		if ( c < smallest ) {
    			smallest = c; 
    		}
    	}
    	return smallest;
    }
    
    public static double getAvg (double[] doubArray) {
    	double sum = 0;
    	for ( double d : doubArray) {
    		sum += d;
    	}
    	double average = sum/doubArray.length;
    	return average; 
    }
    
    public static int[] lengthOfEachString (String[] stringOfWords) {
       	int[] lengthOfStrings = new int[stringOfWords.length];
    	for (int e = 0; e < stringOfWords.length; e++) {
    		lengthOfStrings[e] = stringOfWords[e].length();
    	}
    	return lengthOfStrings;
    }
    
    public static boolean sumEvenGreater (String[] arrayOfStrings) {
    	int sumOfEvens = 0;
    	int sumOfOdds = 0;
    	for (String g : arrayOfStrings) {
    		if (g.length() % 2 == 0) {
    			sumOfEvens += g.length();
    		} else {
    			sumOfOdds += g.length();
    		}
    	}
    	return sumOfEvens > sumOfOdds;
    }
//    public static boolean sumEvenGreater_myTry (String[] arrayOfStrings) {
//    	for (int g = 0; g < arrayOfStrings.length; g++) {
//    		int h = (arrayOfStrings[g].length()%2);
//    		if ( h == 0 ) {
//        		int sumOfEvens = 0;
//        		sumOfEvens += arrayOfStrings[g].length();
//    		} else {
//    			int sumOfOdds = 0;
//    			sumOfOdds += arrayOfStrings[g].length();
//    		}
//    	}
//        return sumOfEvens > sumOfOdds;	
//    }
    
    public static boolean isWordPalindrome (String word) {
    	for (int k = 0; k < word.length(); k++) {
    		if (word.charAt(k) != word.charAt(word.length()- k - 1)) {
    			return false;
       	    }
    	}
    	return true;
    }
    
      
    
    
//    	String fullName = "Mary" + " " + "Brown"; 
//    	int[] gradesArray = {100, 79, 80, 90, 100};
//    	int counter = 1;
//
//    	System.out.println("Student: " + fullName);
//    	System.out.println("Grades: ");
//    	for (int grade : gradesArray) {
//    	System.out.println((counter++) + ": " + grade);
//    	}
    	
//Array methods tests
//System.out.println("Hash Code for gradesArray: " + gradesArray.hashCode());
//System.out.println("Grades Array getClass: " + gradesArray.getClass());    	
//System.out.println("Clone: " + gradesArray.clone());
//System.out.println("notify: " + gradesArray.notify());
//System.out.println("to string: " + gradesArray.toString());


}
    	

