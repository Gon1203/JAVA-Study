package tree_Set;

import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
		// 이름을 문자열로 비교(이미 문자열에도 비교메소드 compareTo가 구현되어 있음)
	}

}

public class App {

	public static void main(String[] args) {
		// 트리셋은 정렬 기능 추가 (반드스 comparable인터페이스를 구현한 클래스 객체 입력)
		TreeSet<Person> people = new TreeSet<>();

		people.add(new Person("펭수"));
		people.add(new Person("라이언"));
		people.add(new Person("가가멜"));
		people.add(new Person("스머프"));

		for (Person p : people) {
			System.out.println(p);
		}

		TreeSet<Integer> list = new TreeSet<>();

		list.add(10);
		list.add(7);
		list.add(1);
		list.add(8);
		list.add(9);
		for (int i : list) {
			System.out.println(i);
		}
	}

}
