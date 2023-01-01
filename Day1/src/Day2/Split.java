package Day2;

public class Split {
	public static void main(String [] args) {
		String line1 = "c@c++@Java";
		String line2 = "Tamil-english-maths-science-social";
		String line3 = "Pen Pencil Rubber";
		String line4 = "India:Pakistan:Srilanka:Singapore:Maldives";
		String line5 = "Spanish#turkish#french#Japanese";
		
		String [] line1Split = line1.split("@");
		System.out.println(line1Split[0]);
		System.out.println(line1Split[1]);
		System.out.println(line1Split[2]);
		
		String[] line2Split = line2.split("-");
		System.out.println(line2Split[0]);
		System.out.println(line2Split[1]);
		System.out.println(line2Split[2]);
		System.out.println(line2Split[3]);
		System.out.println(line2Split[4]);
		
		String[] line3Split = line3.split(" ");
		System.out.println(line3Split[0]);
		System.out.println(line3Split[1]);
		System.out.println(line3Split[2]);
		
		String[] line4Split = line4.split(":");
		System.out.println(line4Split[0]);
		System.out.println(line4Split[1]);
		System.out.println(line4Split[2]);
		System.out.println(line4Split[3]);
		System.out.println(line4Split[4]);
		
		String[] line5Split = line5.split("#");
		System.out.println(line5Split[0]);
		System.out.println(line5Split[1]);
		System.out.println(line5Split[2]);
		System.out.println(line5Split[3]);
	}
}
