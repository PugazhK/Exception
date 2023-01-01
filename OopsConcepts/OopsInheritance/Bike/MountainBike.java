
package Bike;

public class MountainBike extends Bike {
	private int climbingSpeed;
	private int weight;
	
	
	public int getClimbingSpeed() {
		return climbingSpeed;
	}
	public void setClimbingSpeed(int climbingSpeed) {
		this.climbingSpeed = climbingSpeed;
	}
	
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public MountainBike(String brand, int price, int model,int climbingspeed, int weight) {
		super(brand, price, model);
		this.climbingSpeed = climbingspeed;
		this.weight = weight;
	}
	
	public String toString() {
		return super.toString() + " Climbing Speed = " + climbingSpeed + " Weight = " + weight;
	}
	
	
	
	
}
