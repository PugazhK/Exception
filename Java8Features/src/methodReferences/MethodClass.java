package methodReferences;

public class MethodClass {
	
	public int findMax(int[] numbers) {
		int max=numbers[0];
		for(int i:numbers) {
			if(i>max) {
				max=i;
			}
		}
		return max;
	}
	public static int findMin(int[] numbers) {
		int min=numbers[0];
		for(int i:numbers) {
			if(i<min) {
				min=i;
			}
		}
		return min;
	}
	

}
