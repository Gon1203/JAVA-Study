package string_array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class App {

	public static void main(String[] args) {
		// 리스트 -> .stream()
		// 리스트가 아닐 경우 1. Stream.of(입력값)
		// 배열 -> Array.stream(배열명)
		Stream.of("Hello", "bottle", "Afria")
			.sorted() // 정렬 : 알파벳순
			.findFirst()
			.ifPresent(x -> System.out.println(x));

		String[] items = { "치킨", "원숭이", "고릴라", "치약", "고라니", "치과", "고양이" };
		Stream.of(items)
			.filter(s -> s.startsWith("치"))
			.forEach(x -> System.out.print(x+" "));
		
		System.out.println();
			
		int[] numbers = {2,4,6,8,10};
		Arrays.stream(numbers)
			.map(n -> n*n)	// 제곱값
			.average()		// 평균, max(), min()
			.ifPresent(i -> System.out.print(i));
		
		System.out.println();
		
		// 배열을 리스트로
		List<String> list = Arrays.asList(items);
		list.stream()
			.filter(x -> x.startsWith("고"))
			.sorted()
			.forEach(x -> System.out.print(x+" "));
		
		System.out.println();
		
		int[] nums = { 9,4,6,3,1,2,7};
		Arrays.stream(nums)
			.filter(n -> n > 3)
			.sorted()
			.map(s -> s*10)
			.forEach(n -> System.out.println(n));
		
	}

}
