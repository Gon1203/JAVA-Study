package application;

public class Cat {
	private String name;
	private int id; // 아이디(고유번호, 중복이 안됨)
	
	// 스테틱 상수
	public static final String FOOD = "고양이 사료";
	
	//스테틱 변수 (객체들에 공유됨)
	public static int count = 0;	// 초기값 0
	
	public Cat(String name) {
		this.name = name;
		count++;	// 객체 생성 후 count 1 증가
		id = count;	// 객체가 만들어질때마다카운트 증가하면서 저장
	}

	public static int getCount() {
		// 스테틱 메소드는 일반 인스턴스(객체) 변수 사용 불가
//		String s = name; 객체가 만들어 지기 전에 사용 가능하므로 
//		인스턴스 변수는 사용 할 수가 없다.
		return count;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", id=" + id + "]";
	}
	

	
}
