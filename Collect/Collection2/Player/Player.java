package Player;

import java.util.HashMap;

public class Player {
	public static void main(String[] args) {
		HashMap<Integer, String> players = new HashMap<>();
		players.put(10, "Sachin");
		players.put(7, "Dhoni");
		players.put(18, "Virat");
		players.put(45, "Rohit");

//		System.out.println(players);

		System.out.println(players.get(7));

		players.remove(10);
		System.out.println(players);

		System.out.println(players.keySet());
		System.out.println(players.values());

		System.out.println("=======================================================");

		// enhanced for loop//

		for (Integer i : players.keySet()) {
			System.out.println(i);
		}

		for (String k : players.values()) {
			System.out.println(k);
		}

		System.out.println("========================================================");

		// getting the values by iterating key set //

		for (Integer i : players.keySet()) {
			System.out.println(i + " " + players.get(i));
		}

		System.out.println("========================================================");

		// for each//

		players.forEach((x, y) -> {
			System.out.println(x + " " + y);
		});

		players.keySet().forEach((x) -> {
			System.out.println(x);
		});
		players.values().forEach((y) -> {
			System.out.println(y);
		});

		System.out.println("=========================================================");

	}
}
