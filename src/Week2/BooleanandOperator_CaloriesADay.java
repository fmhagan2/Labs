package Week2;

public class BooleanandOperator_CaloriesADay {

	public static void main(String[] args) {

	int caloriesADay = 1700;
	if (caloriesADay == 1500) {
		System.out.println("You have met your calories alloted per day by " + caloriesADay + ".");
	} else if (caloriesADay > 1500) {
		System.out.println("You have exceeded your calories alloted per dayday by " + (caloriesADay - 1500) + " calories.");
	} else {
		System.out.println("You have not met your calories alloted per day. You have " + (1500 - caloriesADay) + " caloires left to consume." );
	}
		                           
	
	
	
	
	
	}
}