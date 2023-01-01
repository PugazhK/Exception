package Oops3review;

public class Hum extends Human {
	public String work() {
		return "Trainer";
	}
	public static void main(String [] args) {
		Hum h = new Hum();
		System.out.println(h.work());
	}
}
