package OOPS2MethodOverRiding;

public class UsePrivateBank {
	public static void main(String[] args) {
		PrivateBank pb = new PrivateBank();
		Bank b = new Bank();
		System.out.println(pb.findtax(1645000));
		System.out.println(b.findtax(1645000));
	}
}
