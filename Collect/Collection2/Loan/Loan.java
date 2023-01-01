package Loan;

public class Loan {
	private int loanAmount;
	private int loanNumber;
	private int interest;
	private int months;
	
	public void setLoanAmount() {
		this.loanAmount = loanAmount;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	
	public void setLoanNumber() {
		this.loanNumber = loanNumber;
	}
	public int getLoanNumber() {
		return loanNumber;
	}
	
	public void setInterest() {
		this.interest = interest;
	}
	public int getInterest() {
		return interest;
	}
	
	public void setMonths() {
		this.months = months;
	}
	public int getMonths() {
		return months;
	}
	
	
	public Loan (int loanAmount, int loanNumber, int interest, int months) {
		this.loanAmount = loanAmount;
		this.loanNumber = loanNumber;
		this.interest = interest;
		this.months = months;
	}
	
	public String toString() {
		return loanAmount +" "+ loanNumber +" "+ interest +" "+ months;
	}
}
