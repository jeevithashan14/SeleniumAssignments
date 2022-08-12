package assignments.week1.day2;

import java.util.Scanner;

public class Calculator {
	 int result;
	 double mulResult;
	 float divResult;
	 
	 //Method for addition
	 public int add(int num1, int num2, int num3) {
		 result = num1+num2+num3;
		 return result;
	 }
	 
	//Method for subtraction
	public int sub(int num1, int num2) {
		result = num1-num2;
		return result;
	}
	
	//Method for multiplication
	public double multiply(double num1, double num2) {
		mulResult = num1*num2;
		return mulResult;
	}
	
	//Method for division
	public float division(float num1, float num2) {
		divResult = num1/num2;
		return divResult;
	}

}
