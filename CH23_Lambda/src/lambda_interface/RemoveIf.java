package lambda_interface;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		numbers.add(9);
		numbers.add(10);
		numbers.add(4);

		// List numbers 안에 있는 정수들 중에 6보다 작으면 다 제거
		// removeIf 메소드는
		numbers.removeIf(i -> i < 6);

		numbers.forEach(x -> System.out.println(x));
		
		List<String> slist = new ArrayList<>();
		slist.add("하나둘");
		slist.add("하나둘셋");
		slist.add("하나");
		slist.add("하나둘셋넷다섯");
		// 문자열 길이가 4 보다 작으면 제거 => 필터 역할
		slist.removeIf(s -> s.length() < 4);
		slist.forEach(s -> System.out.println(s));
		
		
		
	}

}
