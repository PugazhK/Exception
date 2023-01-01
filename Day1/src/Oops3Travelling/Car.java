package Oops3Travelling;

public class Car implements Vehicle, Transport{
	public String mailage() {
		return "Mailage = 40km/hr";
	}
	public int fuelStorage() {
		return 20;
	}
	public int wheels() {
		return 4;
	}
	public int tax(int princiAmount, int tax) {
		return princiAmount+(princiAmount*tax/100);
	}
}
