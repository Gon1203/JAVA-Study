package list_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing_list {

	public static void main(String[] args) {
		// 어레이리스트와 링크드 리스트의 실행 시간
		List<Integer> arraylist = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		long duration = timeOperations(arraylist);
		System.out.println("arrayList 측정 시간 : " + duration);
		long duration2 = timeOperations(linkedList);
		System.out.println("linkedList 측정 시간 : " + duration2);
		// 일반적인 순서대로 입력은 arrayList가 더 빠름
		// 특정 인덱스 번호에 입력이나 제거는 linkedList가 훨씬 빠름
	}
	
	public static long timeOperations(List<Integer> list) {
		long start = System.currentTimeMillis();	// 시간 측정
		for(int i = 0; i < 500000; i++) {	// 0 ~ 10만 - 1 까지 리스트에 입력
			list.add(0,i);
		}
		return System.currentTimeMillis() - start;	// 실행 시간 리턴
		
	}
}
