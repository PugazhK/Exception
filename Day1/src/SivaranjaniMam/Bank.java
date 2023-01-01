package SivaranjaniMam;

public class Bank {
	public int loanEligibility() {
		return 50000;
	}
	public int loanEligibility(int employedExperience, String designation) {
		return 50000+(50000*30/100);
	}
	public int loanEligibility(int markPercentage) {
		if (markPercentage >60) {
			return 50000+(50000*40/100);
		}
		else {
			return 50000+(50000*20/100);
		}
		
	}
}
