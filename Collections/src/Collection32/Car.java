package Collection32;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Car {
	String brand;
	int price;
	String color;

	Car(String brand, int price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public static void main(String[] args) {
		Car c1 = new Car("kia", 8000, "red");
		Car c2 = new Car("verna", 14000, "white");
		Car c3 = new Car("creta", 13000, "yellow");
		Car c4 = new Car("swift", 5000, "blue");

		ArrayList<Car> c = new ArrayList<>();
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);

		int total = 0;
		for (Car i : c) {
			total = total + i.price;
		}
		List<Car> fil = c.stream().filter(x -> x.price > 10000).collect(Collectors.toList());
		for (Car j : fil) {
			System.out.println((j.price * 100) / total);
		}

		Long a = c.stream().count();
		System.out.println(a);

		Long b = c.stream().filter(x -> x.price < 10000).count();
		System.out.println(b);

		Long d = c.stream().filter(x -> x.price > 10000).map(y -> y.brand.contains("a")).count();
		System.out.println(d);
	}
}
