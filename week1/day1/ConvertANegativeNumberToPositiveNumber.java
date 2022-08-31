package assignments.week1.day1;

/*
	*Problem statement: Convert a negative number to positive number
	 * Pseudocode: 
	 * 1. Initialize an integer with a negative number like,
	 * int number = -40;
	 * 2. Check if the number is a negative number 
	 * Hint : any number that is lesser than zero is a negative number 
	 * 3. If so, convert the number to a positive number
	 * 4. Print the converted positive number
*/
 

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       // Initialize an integer with a negative number
		int givenNumber = -100;
		int positiveNumber;
		
		//Check if a number is positive, print "The number is positive
		if(givenNumber > 0) {
			System.out.println("Value of number " +givenNumber+ " is greater than 0 so it is Positive");
		}
		
		//Check if a number is negative, print "The number is negative"
		//Convert the number to a positive number
		//Print the converted positive number
		else if (givenNumber < 0 ) {
		System.out.println("Value of number " +givenNumber+ " is less than 0 so it is Negative");
		positiveNumber = givenNumber * -1;
		System.out.println("Converted Positive Number: " +positiveNumber);
		}
		
	}

}
