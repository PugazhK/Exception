package Oops03;

public class AxisBank implements Bank {
	public int findInterestAmount(int princiAmount) {
		int interest = 20;
		return princiAmount*interest/100;
	}
}
