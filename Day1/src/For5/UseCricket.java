package For5;

public class UseCricket {
	public static void main(String[] args) {
		Cricket player1 = new Cricket();
		player1.name = "Sachin Tendulkar";
		player1.age = 49;
		player1.runs = 18426;
		player1.average = 44.83f;
		
		Cricket player2 = new Cricket();
		player2.name = "Mahendra Singh Dhoni";
		player2.age = 40;
		player2.runs = 10773;
		player2.average = 50.58f;
		
		Cricket player3 = new Cricket();
		player3.name = "Virat Kohli";
		player3.age = 33;
		player3.runs = 12311;
		player3.average = 58.07f;
		
		Cricket player4 = new Cricket();
		player4.name = "Rohit Sharma";
		player4.age = 34;
		player4.runs = 9283;
		player4.average = 48.60f;
		
		Cricket p[] = {player1, player2, player3, player4};
		int highestRun = p[0].runs;
		int topi = 0;
		int lowi = 0;
		int total = 0;
		int longName = 0;
		for (int i=0; i<p.length; i++) {
			total =total +p[i].runs;
			//System.out.println("Player name is "+p[i].name.toUpperCase()+" Player age is "+p[i].age+" total runs " + p[i].runs + " Average "+p[i].average );
			if (highestRun <= p[i].runs) {
				highestRun = p[i].runs;
				topi = i;
			}
			if (p[0].runs >= p[i].runs) {
				lowi = i;
			}
			if (p[0].name.length()<p[i].name.length()) {
				longName = i;
			}
		}
		System.out.println("Total runs of all players " + total);
		System.out.println("Highest scorer name is "+p[topi].name+" "+p[topi].runs);
		System.out.println("Lowest scorer name is "+p[lowi].name+" "+p[lowi].runs);
		System.out.println("The long name is " + p[longName].name +" "+ p[longName].name.length());
	}
}
