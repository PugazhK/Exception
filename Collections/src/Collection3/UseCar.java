package Collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseCar {
	public static void main(String[] args) {
		Car c1 = new Car("audi",5000000,"white");
		Car c2 = new Car("BMW",6000000,"blue");
		Car c3 = new Car("hyundai",1800000,"red");
		Car c4 = new Car("ford",1200000,"black");
		
		ArrayList<Car> c = new ArrayList<>();
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		
		List<String>  let = c.stream().filter(x -> x.getPrice() >= 2000000 && x.getBrand().endsWith("i")).map(y-> y.getBrand().substring(1,y.getBrand().length()-1)).collect(Collectors.toList());
		let.forEach(x->{
			System.out.println(x);
		});
		
		System.out.println("==========================================================================================");
		
		List<Car> le = c.stream().filter(x->x.getPrice() >=1000000 && x.getBrand().endsWith("i")).collect(Collectors.toList());
		for(Car  i : le) {
			System.out.println(i.getBrand().substring(1,i.getBrand().length()-1));
		}
		
		System.out.println("==========================================================================================");
		
		List<Car> bo = c.stream().filter(x-> x.getColor().contains("e")).collect(Collectors.toList());
		for (Car i:bo) {
			if(i.getBrand().contains("a")||i.getBrand().contains("e")||i.getBrand().contains("i")||i.getBrand().contains("o")||i.getBrand().contains("u")) {
				System.out.println(i.getBrand() + " is a vowel");
			}
			else {
				System.out.println(i.getBrand() + " is not a vowel");
			}	
		}
		System.out.println("======================================Adding tax=================================================");
		List<Car> f = c.stream().filter(x-> x.getBrand().contains("a")&& x.getColor().contains("e")).collect(Collectors.toList());
		for(Car r : f) {
			System.out.println(r.getPrice()+(r.getPrice()*10/100));
		}
		System.out.println("=======================================Adding Tax with Map=============================================");
		List<Integer> m = c.stream().filter(x-> x.getBrand().contains("a")&& x.getColor().contains("e")).map(y->y.getPrice()+(y.getPrice()*10/100)).collect(Collectors.toList());
		m.forEach(x-> {
			System.out.println(x);
		});
	}
}
