package exercise;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(1000);
		list.add(3);
		list.add(6);
		list.add(-20);
		list.add(4);

		list.removeIf(n -> n < 0 || n > 10);
		list.replaceAll(n -> n + 100);
		list.forEach(n -> System.out.println(n));
	}

}
