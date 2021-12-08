package sorting_list;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		// 리스트를 정렬
		ArrayList<Double> doubles = new ArrayList<>();

		doubles.add(7.38);
		doubles.add(3.88);
		doubles.add(1.45);
		doubles.add(2.35);
		doubles.add(9.28);

		doubles.forEach(System.out::println);

		Collections.sort(doubles);

		for (Double d : doubles) {
				System.out.println(d);
			}
		
		// 기본타입 숫자등은 값으로 정렬, 문자열,문자 등은 알파벳순 정렬 한글은 가나다라순
		
		// 커스텀 객체의 정렬
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(new Person("펭수"));
		people.add(new Person("길동"));
		people.add(new Person("라이언"));
		people.add(new Person("둘리"));

		Collections.sort(people);	// 정렬 
		
//		for(Person p : people) {
//			System.out.println(p);
//		}
		people.forEach(System.out::println);
	}

}
