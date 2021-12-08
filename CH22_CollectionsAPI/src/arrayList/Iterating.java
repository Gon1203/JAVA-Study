package arrayList;

import java.util.ArrayList;

public class Iterating {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(); // 정수타입 리스트 생성

		// 리스트에 정수 추가
		list.add(7);
		list.add(9);
		list.add(123);

		// for-each 반복문 : 간단하게 출력
		for(Integer n : list) {
			System.out.println(n);
		}
		
		// for 반복문 : 인덱스 번호가 필요할때
		for (int i = 0; i<list.size();i++) {
			Integer n = list.get(i);
			System.out.println(i+ " : " + n);
		}
		
		// 컬렉션 객체.forEach(각각 반복), 람다식 표현
		list.forEach(e -> System.out.println(e));
		
		// 메소드 래퍼런스
		list.forEach(System.out::println);
	}

}
