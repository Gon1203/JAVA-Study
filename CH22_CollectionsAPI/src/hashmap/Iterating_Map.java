package hashmap;

import java.util.HashMap;

public class Iterating_Map {

	public static void main(String[] args) {
		// 맵 타입을 반복문 출력
		HashMap<String, String> months = new HashMap<>();

		months.put("JAN", "1월");
		months.put("FEB", "2월");
		months.put("MAR", "3월");
		months.put("APR", "4월");
		months.put("MAY", "5월");
		months.put("JUN", "6월");

		// 람다식 출력
		months.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println();

		// entryset() : key와 value를 가져옴
		for (var entry : months.entrySet()) {
			String k = entry.getKey();
			String v = entry.getValue();
			System.out.println(k + " : " + v);

		}
		
		System.out.println();
		// keySet() 키 값만 가져옴 
		for (String k : months.keySet()) {
			String v = months.get(k);
			System.out.println(k + " : " + v);

		}

	}

}
