package assignments.week3.day1.org.bank;

/*Base Class AxisBank extends BankInfo Class*/
public class AxisBank extends BankInfo {

	// Add Method: Deposit
	public void deposit() {
		System.out.println("Base Class: Deposit");
		System.out.println("");
	}

	// Override Method Deposit in AxisBank Class from BankInfo Class
	public void overrideDeposit() {

		// call method Deposit from Axis Bank Class: by 'this' keyword
		System.out.println("Base Class Deposit Method Call by 'this' keyword:");
		this.deposit();	

		// call method Deposit from BankInfo Class: by 'super' keyword
		System.out.println("Super Class Deposit Method Call by 'super' keyword:");
		super.deposit();
		System.out.println("");
	}

	public static void main(String[] args) {

		// Create an object for Base: AxisBank Class
		AxisBank axisbank = new AxisBank();

		// call methods present in 'AxisBank' Class
		System.out.println("Call methods present in AxisBank(Base Class)");
		axisbank.deposit();
		axisbank.overrideDeposit();
		System.out.println("");

		// call methods present in 'AxisBank' Class
		System.out.println("Call methods present in BankInfo(Super Class)");
		axisbank.saving();
		axisbank.fixed();
		
	}

}
