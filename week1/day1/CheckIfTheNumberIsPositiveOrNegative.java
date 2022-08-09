package assignments.week1.day1;

import java.util.Scanner;

//Problem statement: Check if the number is positive or negative
	/*Pseudocode
	 * : ---------- 
	 * 1. Initialize a number, say, int number= 35; 
	 * 
	 * 2. If a number is positive, print "The number is positive" 
	 * 
	 * If a number is negative, print "The number is negative" 
	 * 
	 * If it nether negative nor positive, print as
	 * 
	 * "The number is neither positive nor negative"
	 */

public class CheckIfTheNumberIsPositiveOrNegative {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		//Get Input from Console
	     int number;
	     
	     Scanner scan = new Scanner(System.in);
	     System.out.println("Enter the Number: ");
	     number = scan.nextInt();
	     scan.close();
		
		//If a number is positive, print "The number is positive		
		if(number > 0) {
			System.out.println("Value of number " +number+ " is greater than 0 so it is Positive");
		}
		//If a number is negative, print "The number is negative"
		else if(number < 0 ){
			System.out.println("Value of number " +number+ " is less than 0 so it is Negative");
		}
		//If it nether negative nor positive, print as
		else {
			System.out.println("number " +number+ " is neither positive nor negative, the number is equal to 0");
		}
		

	}

}
