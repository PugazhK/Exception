package Oops3NumberPlate;

public class UseCentralGov {
	public static void main(String[] args) {
		ChennaiGov cg = new ChennaiGov();
		KarnatakaGov kag = new KarnatakaGov();
		KeralaGov keg = new KeralaGov();
		
		System.out.println(cg.color());
		System.out.println(kag.findFont());
		System.out.println(keg.findFont());
	}
}
