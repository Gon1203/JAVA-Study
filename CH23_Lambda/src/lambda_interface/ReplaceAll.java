package lambda_interface;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAll {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);

//		numbers.replaceAll(new UnaryOperator<Integer>() {
//			public Integer apply(Integer t) {
//				return t*t;
//			}
//		});
		numbers.replaceAll(n -> n * n);

		numbers.forEach(n -> System.out.println(n));

		List<String> friends = new ArrayList<String>();
		friends.add("펭수");
		friends.add("길동");
		friends.add("메리");
		friends.add("철수");
		friends.replaceAll(s -> "안녕~ "+ s);
		friends.forEach(s -> System.out.println(s));
	}

}
