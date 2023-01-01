package OOPS2MethodOverLoading;

public class IndianBank {
	public int findLoanBank() {
		return 30000;
	}
	public int findLoanBank(int salary) {
		return 30000 + salary*10;
	}
	public int findLoanBank(int salary, int prop) {
		return 30000 + (salary*10) + (prop/10);
	}
}
