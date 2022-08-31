package assignments.week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		// Here is the input
				int[] arr = {1,2,8,4,7,6,3};
				
		// Sort the array and print it using 'toString'
				Arrays.sort(arr);
				System.out.println(Arrays.toString(arr));
		
	     /*loop through the array (start i from arr[0] till the length of the array)
		   check if the iterator variable is not equal to the array values respectively
	       print the number
	       once printed break the iteration
	     */
				
		for (int i=0; i<arr.length-1; i++) {
			if (arr[i]+1!=arr[i+1]) {
				System.out.println("Missing number in an array: "+(arr[i]+1));
				break;
			}
		}

	}

}
