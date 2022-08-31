package assignments.week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	
	/*
	 * Psuedocode
	 * 
	 * a) Remove the duplicates using Set
	 * b) Make sure the set is in the ascending order
	 * c) Iterate from the starting number and verify the next number is + 1
	 * d) If did not match, that is the number
	 * 
	 */

	public static void main(String[] args) {
		
		int[] data = {10,3,2,5,4,7,8,9,1};
		
		Set<Integer> s1 = new TreeSet<Integer>();
		for(int i=0; i<data.length;i++) {
			s1.add(data[i]);
		}		
		System.out.println("Sorted Array in Ascending Order: "+s1);
		
		for(int i=1;i<s1.size();i++) {
			if(!s1.contains(i)) {
				System.out.println("Missed Number:" +i);
				break;
			}
			
		}
		
	   
	 
		

	}

}
