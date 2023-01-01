package Day1;

public class MarkSheet {
	public static void main(String [] args) {
		
		String name  = "Pugazh";
		char section = 'A';
		long idNumber = 1913081033018l;
		int tamil = 97;
		int english = 94;
		int maths = 69;
		int science = 96;
		int social = 93;
		int total = tamil+english+maths+science+social;
		float average = ((tamil+english+maths+science+social)/5f);
		
	System.out.println("My name " + name + "." );
	System.out.println("My section " + section + ".");
	System.out.println("My idNumber " + idNumber + ".");
	System.out.println("My Mark in Tamil " + tamil + ".");
	System.out.println("My Mark in English " + english + ".");
	System.out.println("My Mark in Maths " + maths + ".");
	System.out.println("My Mark in Science " + science + ".");
	System.out.println("My Mark in Social " + social + ".");
	System.out.println("My Total Mark is " + total + ".");
	System.out.println("My Average is " + average + ".");
	}
}
