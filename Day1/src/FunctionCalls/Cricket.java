package FunctionCalls;

public class Cricket {
	String teamName;
	String playerName;
	int age;
	int totalRuns;
	
	public void highRun(Cricket [] p) {
		int maxRun = 0;
		for (int i=0; i<p.length; i++) {
			if (totalRuns < p[i].totalRuns) {
				
			}
			else {
				System.out.println( p[i]);
			}
		}
	}
}
