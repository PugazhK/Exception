package methodReferences;

public interface MethodReference {
	public int maxOrMin(int[] numbers);
	
	public default String printString(String word) {
		return "The string value is "+word;
	}

}
