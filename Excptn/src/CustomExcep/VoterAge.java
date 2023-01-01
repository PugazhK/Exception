package CustomExcep;

public class VoterAge {
	public static void main(String[] args) throws ArithmeticException, AgeException, Exception{
		
		int a = 16;
		
		if(a>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			throw new AgeException("Not Eligible");
		}
		
	}
}
