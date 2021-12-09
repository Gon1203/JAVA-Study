package list_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();
		// 어레이 리스트
		list.add(5);
		list.add(7);
		list.add(8);
		// 링크드 리스트
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		displayList(list);	// 콘솔에 입력된 리스트 타입 객체
		System.out.println();
		displayList(list2);
		System.out.println();
		
		List<Integer> list3 = new ArrayList<>();
		
		list3.addAll(list);
		list3.addAll(list2);
		
		displayList(list3);
	}
	
	/**
	 * 입력된 리스트 타입 객체의 아이템들을 출력
	 * @param list
	 */
	private static void displayList(List<Integer> list) {
//		list.forEach(System.out::println);
		for(int i : list) {
			System.out.println(i);
		}
	}
}