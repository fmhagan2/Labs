package Week2;

import java.util.Scanner;

public class UserInputPractice {

	public static void main (String[] args) {
		
		int count = 3;
		boolean loggedIn = false;
		Scanner sc = new Scanner(System.in);  
		
		while (!loggedIn && count > 0) {
			count--;
			System.out.print("Enter username: ");  
			String username = sc.nextLine();   
			System.out.print("Enter password: ");  
			String password = sc.nextLine();   
			if (username.equals("samy123") && password.equals("12345")) {
				System.out.println("Welcome back " + username +"!");
				loggedIn = true;
		    } else { 
		    	System.out.println("Inaccurate credentials! You have " + count + " more attempts remaining."); 
		    	if (count == 0) {
		    		System.out.println("You have been locked out.");
		    	}
		    } // end of else 
		} // end of while
		
		sc.close();
	}
}
