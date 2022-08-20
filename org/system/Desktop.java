package assignments.week3.day1.org.system;

public class Desktop extends Computer {

	// Create a Method: Desktop Size
	public void desktopSize(String size) {
		System.out.println("Desktop Size is: " + size);
	}

	// Main Method
	public static void main(String[] args) {

		// Create an Object for Desktop Class
		Desktop desktop = new Desktop();
		// Call the Computer and Desktop Class Methods
		System.out.println("Inherited Methods from Computer and Desktop Classes: ");
		desktop.desktopSize("21 inches");
		desktop.computerModel("XPS 15 9530");
		System.out.println("");

		// Create an Object for Desktop Class
		Computer computer = new Computer();
		// Call the Computer Class Methods
		System.out.println("Inherited Computer Class Method: ");
		computer.computerModel("XPS 15 9530");

	}

}
