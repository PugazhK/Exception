package For5;

public class UseElection {
	public static void main (String [] args) {
		Election e1 = new Election();
		e1.candidateName = "Arun";
		e1.candidateVote = 20000;
		e1.candidateAge = 35;
		
		Election e2 = new Election();
		e2.candidateName = "Pugazh";
		e2.candidateVote = 30000;
		e2.candidateAge = 28;
		
		Election e3 = new Election();
		e3.candidateName = "Pragadheesh";
		e3.candidateVote = 40000;
		e3.candidateAge = 30;
		
		Election[] elect = {e1,e2,e3};
		Election [] el = new Election [3];
		
		int highvote = elect[0].candidateVote;
		String highvotName = elect[0].candidateName;
		int highvotAge = elect[0].candidateAge;
		
		for (int i=0; i<elect.length; i++) {
			if (highvote < elect[i].candidateVote) {
				highvote =elect[i].candidateVote;
				highvotName = elect[i].candidateName;
				highvotAge = elect[i].candidateAge;
			}
		}
		System.out.println("the winning vote is "+highvote+" the winner name is "+highvotName+" the winner age is " +highvotAge);
		
		int total = 0;
		for (int i=0; i<elect.length; i++) {
			total = total + elect[i].candidateVote;
		}
		System.out.println(" the total vote  is " +total);
		int a = (highvote*100)/total;
		System.out.println(" the winning percentage is " + a);
		
		
		//String name = "";
		//for (int i=0; i<elect.length; i++) {
				
			}
		}


	
	



		

