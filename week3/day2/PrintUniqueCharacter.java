package assignments.week3.day2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * Psuedocode
 * 
 * a) Take your name as input
 * b) Print all unique characters only (any order)
 * 
 * Input:  babu
 * Output: a u 
 * 
 */

/*
 * Psuedocode
 * 
 * a) Convert String to Character array
 * b) Create a new Set -> HashSet
 * c) Add each character to the Set and if it is already there, remove it
 * d) Finally, print the set
 * 
 */	 


public class PrintUniqueCharacter {

	public static void main(String[] args) {

		String str = "babu";
	     char[] chars = str.toCharArray();
	     
	     Set<Character> set = new HashSet<Character>();
	     
	     for (int i=0;i<chars.length;i++) {
	    	 set.add(chars[i]);
	     }
	     
	     List<Character> list = new LinkedList<Character>(set);
	     
	     for(int i=0;i<list.size();i++) {
	    	 int count=0;
	    	 for (int j=0;j<chars.length;j++) {
	    		 if (list.get(i)==chars[j]) {
	    			 count++;
	    		 }
	    	 }
	    	 if(count==1) {
	    		 System.out.println(list.get(i));
	    	 }
	     }	     
	   }
	}
