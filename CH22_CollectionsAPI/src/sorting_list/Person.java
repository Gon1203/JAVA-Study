package sorting_list;

// 정렬을 할수있게 Comparable 비교가능한 인터페이스 구현
public class Person implements Comparable<Person>{
	private String name;
	
	public Person(String name) {
		this.name = name;
		
	}
	
	public String toString() {
		return name;
	}

	public int compareTo(Person o) {
		// Person 객체끼리 비교해서 누가 큰 값인지 코드 작성
		return name.compareTo(o.name);
		// 문자열 끼리 비교하는 메소드 compareTo 사용(name을 기준)
	}
}
