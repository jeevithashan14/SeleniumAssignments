package assignments.week3.day2;

import java.util.ArrayList;
import java.util.List;

/*
 * Pseudo Code
 *input: int[] a={3,2,11,4,6,7};
 *        int[] b={1,2,8,4,9,7};
 *output:2,4,7
 *
 * a) Declare An Array for {3,2,11,4,6,7};	 
 * b) Declare another Array for {1,2,8,4,9,7};
 * c) create a two empty Lists - list1 & list2
 * c) Declare for loop iterator from 0 to array a.length and add into list1
 * d) Declare for loop iterator from 0 to array b.length and add into another list2
 * e) Compare Both list1 & list2 using a nested for loop
 *    1)Print the matching number
 *  
 */

public class FindIntersection {

	public static void main(String[] args) {
		
		 List<Integer> list1 = new ArrayList<Integer>();
		 list1.add(3);
		 list1.add(2);
		 list1.add(11);
		 list1.add(4);
		 list1.add(6);
		 list1.add(7);		 
		 System.out.println("List 1 array: "+list1);		 
		 
	     List<Integer> list2 = new ArrayList<Integer>();
	     list2.add(1);
	     list2.add(2);
	     list2.add(8);
	     list2.add(4);
	     list2.add(9);
	     list2.add(7);
	     System.out.println("List 2 array: "+list2);	
	     
	     List<Integer> list3 = new ArrayList<Integer>();
	     
	     for (int i=0;i<list1.size();i++) {
	    	 int arr1=list1.get(i);
	    	 for (int j=0;j<list2.size();j++) {
	    		 int arr2=list2.get(j);
	    		 if (arr1==arr2) {	    			 
	    			 list3.add(arr2);
	    		 }
	    	 }	    	
	     }
	     System.out.println("Intersection are: "+list3);
	}
}

