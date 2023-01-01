package OOPS2Inheritance;

public class UseAxisBank {
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.branch = "Chennai";
		ab.address = "23, thiruvanmiyur, chennai-41";
		ab.maxLoan = 1000000;
		ab.atm = true;
		
		System.out.println("The branch name of the Axis Bank is "+ab.branch);
		System.out.println("The address of the bank is "+ab.address);
		System.out.println("The maximum loan available in this bank is "+ab.maxLoan);
		System.out.println("is there ATM "+ab.atm);
		System.out.println(ab.findtax(120000,56));
	}
}
