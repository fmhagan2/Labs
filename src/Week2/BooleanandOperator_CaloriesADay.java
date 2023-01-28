package Week2;

import java.util.Scanner;

public class BooleanandOperator_CaloriesADay {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);    

	// int caloriesADay = 1700;
	System.out.println("Calories consumed today: ");	
	
	int caloriesADay = sc.nextInt();
	
	if (caloriesADay == 1500) {
		System.out.println("You have met your calories alloted per day by " + caloriesADay + ".");
	} else if (caloriesADay > 1500) {
		System.out.println("You have exceeded your calories alloted per dayday by " + (caloriesADay - 1500) + " calories.");
	} else {
		System.out.println("You have not met your calories alloted per day. You have " + (1500 - caloriesADay) + " caloires left to consume." );
	}
		                           
	//double weight = 180;		//in pounds
	//double height = 66;			//in inches	
	
	System.out.println("Name: ");
	@SuppressWarnings("unused")
	String name = sc.nextLine();
	
	System.out.println("Enter weight (in pounds): ");
	double weight = sc.nextInt();
	
	System.out.println("Enter height (in inches): ");
	double height = sc.nextInt();
	
	double BMI = weight/ Math.pow(height, 2)*703; //Math.pow(base, exponent)
	System.out.println(BMI);
	
	if (BMI < 18.5) {
		System.out.println("Underweight");
	} else if (18.5 <= BMI && BMI <= 24.9) {
		System.out.println("Normal or healthy weight.");
	} else if (BMI >= 25.0 && BMI <= 29.9) {
		System.out.println("Overweight");
	} else if (BMI >= 30.0 && BMI <= 39.9) {
		System.out.println("Obese");
	} else {
		System.out.println("Morbidly Obese");
	}
	
	sc.close();
	
	
	}
}