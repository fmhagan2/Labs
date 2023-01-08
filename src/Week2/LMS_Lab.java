package Week2;

public class LMS_Lab {
	public static void main(String[]args) {
		
		//Has license
		
		int age = 17;
		boolean hasLicense = age >= 16;
		
		if (hasLicense) {
			System.out.println("You can drive.");
		} else {
			System.out.println("You cannot drive.");
		}
		
		
		//Got Milk?
		
		double costOfMilk = 2.99;
		int thirstLevel = 5;
		
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please!");
		} else {
			System.out.println("No Thanks.");
		}
		
		
		//Cookies For Teacher
		
		int numberOfCookies = 29;
		int numberOfChildren = 6;
		int cookiesForTeacher = (numberOfCookies % numberOfChildren);
		
		if (cookiesForTeacher == 0) {
			System.out.println("Sad Face ):");
		} else if (cookiesForTeacher < 2) {
			System.out.println("Yes!");
		} else if (cookiesForTeacher < 5) {
			System.out.println("WhooHoooo!");
		} else {
			System.out.println("Jackpot!");
		}
		
		
		//Rewards Program
		//NOT SURE RESULT IS WHAT WAS REQUESTED
		String loyaltyMemberStatus = "GOLD";
		double loyaltyMemberDiscount = 0.0;
				
		switch (loyaltyMemberStatus) {
		
			case "SILVER": loyaltyMemberDiscount = 0.10;
				break;
			case "GOLD": loyaltyMemberDiscount = 0.15;
				break;
			case "PLATINUM": loyaltyMemberDiscount = 0.25;
				break;
			default: System.out.println(0.0);
		}
		System.out.println("Member Status: " + loyaltyMemberStatus);
		System.out.println("Loyalty Member Disount: " + loyaltyMemberDiscount);

		
		//Rewards towards Bill
		
		double billTotal = 800;
		double adjustedTotal = billTotal - (loyaltyMemberDiscount * billTotal);
		
		System.out.println(adjustedTotal);
		
		if (adjustedTotal > 500 && loyaltyMemberStatus == "SILVER") {
			loyaltyMemberStatus = "GOLD";
		} else if (adjustedTotal > 500 && loyaltyMemberStatus == "GOLD") {
			loyaltyMemberStatus = "PLATINUM";
		}
		System.out.println("You are now a " + loyaltyMemberStatus + " member!");

		
		//Username & Password
		
		String username = "Tommy1234"; 
		String password = "1245";
		
		if (username == "Tommy1234" && password == "12345") {
			System.out.println("Login Successful");
		} else if (username == "Tommy1234"){
			System.out.println("Access Denied. Password Incorrect.");
		} else {
			System.out.println("Username not found.");
		}
	
	
		//Basic Number Loops
		
		int x = 0;
	//Loop 1		
		for (x = 0; x < 10; x++) {
			System.out.println(x);
		}
	//Loop 2
		for (x = 10; x >= 0; x--) {
			System.out.println(x);
		}
	//Loop 3	
		for (x = 0; x <= 100; x+=2){
			System.out.println(x);
		} 
	//Loop 4
		for (x = 0; x <= 100; x++){
			if (x % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		}
	//Loop 5	
		int a = 100;
		while (a > 0) {
			int remainder = a % 3;
			System.out.println(a + " " + remainder);
			a--;
		}
	}
	}
