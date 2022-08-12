package assignments.week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
		int firstNumber=0, secondNumber=1, sum=0;
		
		//Print first number
		System.out.println(firstNumber+"\n" +secondNumber);
		
		//Iterate from 1 to the 11
		for(int i=1; i<=9; i++) {
			
			/*Add first and second number assign to sum
			  Assign second number to the first number
			  Assign sum to the second number
			  Print sum*/
			
			sum = firstNumber+secondNumber;
			System.out.println(sum);
			firstNumber=secondNumber;
			secondNumber=sum;
			
		}

	}

}
