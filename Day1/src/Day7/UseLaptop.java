package Day7;

public class UseLaptop {
	public static void main(String[] args) {

		Laptop l1 = new Laptop();
		l1.brand = "lenovo";
		l1.price = 40000;

		Laptop l2 = new Laptop();
		l2.brand = "dell";
		l2.price = 50000;

		int amount = 0;
		if (l1.price > l2.price) {
			amount = l1.price;
		} else {
			amount = l2.price - 10000;
		}
		System.out.println(amount);
	}
}
