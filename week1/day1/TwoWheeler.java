package assignments.week1.day1;

/*
 * Create a class for TwoWheeler and declare below global variables with appropriate values
		int noOfWheels
		short noOfMirrors
		long chassisNumber
		boolean isPunctured
		String bikeName
		double runningKM
  * Create object for TwoWheeler and call all the variables inside main method and print the values.
 */

public class TwoWheeler {
	
		// Declaring Global Variables with Values
		public int noOfWheels = 2;
		public short noOfMirrors = 2;
		public long chassisNumber = 123456789L;
		public boolean isPunctured = false;
		public String bikeName = "Hero MotoCorp";
		public double runningKM = 105.3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object Creation for TwoWheeler
		TwoWheeler bike = new TwoWheeler();
		
		//call all the variables inside main method and print the values
		System.out.println(bike.noOfWheels);
		System.out.println(bike.noOfMirrors);
		System.out.println(bike.chassisNumber);
		System.out.println(bike.isPunctured);
		System.out.println(bike.bikeName);
		System.out.println(bike.runningKM);

	}

}
