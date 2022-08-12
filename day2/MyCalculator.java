package assignments.week1.day2;

import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNumber = scan.nextInt();

		System.out.println("Enter second number");
		int secondNumber = scan.nextInt();
		
		System.out.println("Enter third number");
		int thirdNumber = scan.nextInt();
		
		System.out.println("Enter double first number");
		double doubleFirstNumber = scan.nextDouble();
		
		System.out.println("Enter double second number");
		double doubleSecondNumber = scan.nextDouble();
		
		System.out.println("Enter float first number");
		float floatFirstNumber = scan.nextFloat();
		
		System.out.println("Enter float second number");
		float floatSecondNumber = scan.nextFloat();
		
		Calculator calOutput = new Calculator();
		
		// call all the methods from Calculator and print the results
		int addResult = calOutput.add(firstNumber, secondNumber, thirdNumber);
		System.out.println("Addition Result: " +addResult);
		
		int subResult = calOutput.sub(firstNumber, secondNumber);
		System.out.println("Subtraction Result: " +subResult);
		
		double multiplicationResult = calOutput.multiply(doubleFirstNumber, doubleSecondNumber);
		System.out.println("Multiplication Result: " +multiplicationResult);
		
		float divisionResult = calOutput.division(floatFirstNumber, floatSecondNumber);
		System.out.println("Division Result: " +divisionResult);		
		

	}

}
