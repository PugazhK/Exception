package Oops3Board;

public class UseBoard {
	public static void main(String[] args) {
		BlackBoard bb = new BlackBoard();
		WhiteBoard wb = new WhiteBoard();
		DigitalBoard db = new DigitalBoard();
		
		System.out.println(bb.area(40, 20));
		System.out.println(bb.writeOpt("chalk"));
		
		System.out.println(wb.area(60, 30));
		System.out.println(wb.writeOpt("Marker"));
		
		System.out.println(db.area(20, 25));
		System.out.println(db.writeOpt("Stick"));
	}
}
