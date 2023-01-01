package Oops2Test;

public class UseAxisBank {
	public static void main (String [] args) {
		AxisBank ab = new AxisBank ();
		ab.branch = "Perungudi";
		ab.address = "No.43, Main Road, Perungudi";
		System.out.println(ab.branch +" "+ab.address+" "+ab.loanAvailable());
	}
}
