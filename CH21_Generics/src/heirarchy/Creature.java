package heirarchy;

public class Creature {
	// 필드 변수, 인스턴스 변수
	private String name;
	
	public Creature(String name) {	// 생성자
		this.name = name;
	}

	@Override
	public String toString() {	// toString 메소드 오버라이드
		return name;
	}
	
	public void feed() {	// feed 메소드
		System.out.println("생물 피드");
	}
}
