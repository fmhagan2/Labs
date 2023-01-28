package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class week4_lab {
	public static void main(String[] args) {
		
		StringBuilder numbers = new StringBuilder ();
		for (int a = 0; a < 10; a++) {
			if (a != 9) {
				numbers.append(a + "-");
			} else {
				numbers.append(a);
			}
		}
		
//		for (int b = 0; b < 10; b++) {
//			numbers.append(b);
//			if (b != 9) {
//				numbers.append("-");
//			}
//		}
		
		System.out.println(numbers.toString());
		
///////////////////////////////////////////////////////////////////////////////
		
		List<String> list1 = new ArrayList<String>();
		list1.add("First List Item");
		list1.add("List Item 2");
		list1.add("Third item");
		list1.add("Fouth Item to List");
		list1.add("This is the fifth item to the list");
		
		//Another way to create Items in the list. Put after =: Arrays.asList("First List Item", "List Item 2", ...);
		
		System.out.println(returnShortest(list1));
		//System.out.println(elementsSwitched(list1));
		System.out.println(elementsByCommas(list1));
		System.out.println(searchResults(list1, "Item"));
		System.out.println("Length of each Item in List: " + lengthOfStrings(list1));
		
//////////////////////////////////////////////////////////////////////////////
		
		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		List<List<Integer>> sortedDivisibles = numbersDivisible(listOfNumbers);
		
		for (List<Integer> divisibleList : sortedDivisibles) {
			System.out.println(divisibleList);
		}
		
/////////////////////////////////////////////////////////////////////////////
		
		Set<String> add5 = new HashSet<String>();
		add5.add("Item 1");
		add5.add("Not null");
		add5.add("Not Null 2");
		add5.add("Item 3");
		add5.add("Not Null item 4");
		
		System.out.println("Set element starts with: " + startWithChar(add5, 'I'));
		System.out.println("Set to List: " + setToList(add5));
		
/////////////////////////////////////////////////////////////////////////////
		
		Set<Integer> setOfNumbers = new HashSet<Integer>();
		setOfNumbers.add(1);
		setOfNumbers.add(2);
		setOfNumbers.add(3);
		setOfNumbers.add(4);
		setOfNumbers.add(5);
		System.out.println("Only Evens from set: " + onlyEvens(setOfNumbers));
		
///////////////////////////////////////////////////////////////////////////////
		
		Map<String, String> definitions = new HashMap<String, String>();
		definitions.put("Left", "to no longer be present");
		definitions.put("Arrive","to no longer be absent");
		definitions.put("television", "a device used for viewing movies");
		
		System.out.println("Definition of word: " + definitionOfWord(definitions, "television"));
		
//////////////////////////////////////////////////////////////////////////////
		
		Map<Character, Integer> counts = stringsStartChar(list1);
		for ( Character charact : counts.keySet() ) {
			System.out.println(charact + "-" + counts.get(charact));
		}
	}

	
//Methods
	
	public static String returnShortest(List<String> stringList) {
		String shortestString = stringList.get(0);
		for (String string : stringList) {
			if (string.length() < shortestString.length()) {
				shortestString = string;
			}
		}
		return shortestString;
	}
	
	public static List<String> elementsSwitched(List<String> stringList2) {
		String firstElement = stringList2.get(0);
		String lastElement = stringList2.get(stringList2.size()-1);
		stringList2.set(0, lastElement);
		stringList2.set(stringList2.size() - 1, firstElement);
		return stringList2;
	}
	
	public static String elementsByCommas(List<String> stringList3) {
		StringBuilder stringOfElements = new StringBuilder();
		for (String string : stringList3) {
			stringOfElements.append(string + ", ");
		}
		return stringOfElements.toString();
	}
	
	public static List<String> searchResults(List<String> stringList4, String toSearch) {
		List<String> resultsOfSearch = new ArrayList<String>();
		for (String string : stringList4) {
			if (string.contains(toSearch)) {
			resultsOfSearch.add(string);
			}
		}
		return resultsOfSearch;
	}
	
	public static List<List<Integer>> numbersDivisible(List<Integer> numberList) {
		List<List<Integer>> allDivisibleNumbers = new ArrayList<List<Integer>>();
		List<Integer> dividesBy2 = new ArrayList<Integer>();
		List<Integer> dividesBy3 = new ArrayList<Integer>();
		List<Integer> dividesBy5 = new ArrayList<Integer>();
		List<Integer> dividesNot = new ArrayList<Integer>();
		allDivisibleNumbers.add(dividesBy2);
		allDivisibleNumbers.add(dividesBy3);
		allDivisibleNumbers.add(dividesBy5);
		allDivisibleNumbers.add(dividesNot);

		for (int i : numberList) {
			if (i % 2 == 0) {
				dividesBy2.add(i);
			}
			if (i % 3 == 0) {
				dividesBy3.add(i);
			}
			if (i % 5 == 0) {
				dividesBy5.add(i);
			} 
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
				dividesNot.add(i);
			}
		}
		return allDivisibleNumbers;
	}
	
	public static List<Integer> lengthOfStrings(List<String> stringList5) {
		List<Integer> lengthOfEach = new ArrayList<Integer>();
		for (String string : stringList5) {
			int s = string.length();
			lengthOfEach.add(s);
		}
		return lengthOfEach;
	}
	
	public static Set<String> startWithChar(Set<String> stringSet, char charStart) {
		Set<String> resultsOfCharStart = new HashSet<String>();
		for (String string : stringSet) {
			if (string.charAt(0) == charStart) {
				resultsOfCharStart.add(string);
			}
		}
		return resultsOfCharStart;
	}
	
	public static List<String> setToList(Set<String> setOfStrings) {
		List<String> listOfStrings = new ArrayList<String>();
		for (String string : setOfStrings) {
			listOfStrings.add(string);
		}
		return listOfStrings;
	}
	
	public static Set<Integer> onlyEvens(Set<Integer> numbersSet) {
		Set<Integer> evensOfSet = new HashSet<Integer>();
		for (int i : numbersSet) {
			if (i % 2 == 0) {
				evensOfSet.add(i);
			}
		}
		return evensOfSet;
	}
	
	public static String definitionOfWord(Map<String, String> mapToInput, String word) {
		for (String key : mapToInput.keySet()) {
			if (key.equals(word)) {
				return mapToInput.get(key);
			}
		}
		return "";
	}
	
	public static Map<Character, Integer> stringsStartChar(List<String> stringList6) {
		Map<Character, Integer> mapOfStartChars = new HashMap<Character, Integer>();
		for (String word : stringList6) {
			char c = word.charAt(0);
			if (mapOfStartChars.get(c) == null) {
				mapOfStartChars.put(c, 1);
			} else {
				mapOfStartChars.put(c, mapOfStartChars.get(c) + 1);
			}
		}
		return mapOfStartChars;
	}
}
