package FunctionCalls;

public class FindMaxMin {
	public void findMax(int a, int b, int c) {
		int [] num = {a,b,c};
		int high=num[0];
		for(int i=0; i<num.length; i++) {
			if(num[i]> high) {
				high = num[i];
			}
		}
		System.out.println(high);
	}
	
	public static void main(String[] args) {
		FindMaxMin max = new FindMaxMin();
		max.findMax(5, 7, 3);
	}
}
