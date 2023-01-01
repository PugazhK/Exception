package For4;

public class AlphabetAndNumbersSeparation {
	public static void main(String[] args) {
		String a = "17JN5A0505";
		char b[] = a.toCharArray();
		int  count1=0;
		int count2=0;
		for (int i=0; i<b.length; i++) {
			if (b[i]>='a'&&b[i]<='z'||b[i]>='A'&&b[i]<='Z') {
				count1=count1+1;
			}
			else {
				count2=count2+1;
			}
		}
		System.out.println("The alphabets are "+count1);
		System.out.println("The number are "+count2);
	}
}
