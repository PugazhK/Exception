package Day4;

public class LmsMark {
	public static void main(String [] args) {
		int tamil = Integer.parseInt(args[0]);
		int english = Integer.parseInt(args[1]);
		int math = Integer.parseInt(args[2]);
		int science = Integer.parseInt(args[3]);
		int social = Integer.parseInt(args[4]);
		
		int total = (tamil+english+math+science+social);
		float average = (total/5);
		
		System.out.println("The total mark is "+total);
		System.out.println("The average is "+average);
	}
}
