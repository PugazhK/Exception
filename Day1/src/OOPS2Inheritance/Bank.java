package OOPS2Inheritance;

public class Bank {
    int maxLoan;
	boolean atm;
	public int findtax(int principleAmount, int tax) {
		return principleAmount*tax/100;
	}
}
