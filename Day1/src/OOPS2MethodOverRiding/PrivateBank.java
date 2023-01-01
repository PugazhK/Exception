package OOPS2MethodOverRiding;

public class PrivateBank extends Bank {
	public int findtax(int principleAmount) {
		return principleAmount*10/100;
	}
}
