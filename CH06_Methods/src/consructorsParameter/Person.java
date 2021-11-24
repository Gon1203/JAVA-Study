package consructorsParameter;

public class Person {
	private String name;
	private double height;
	
	// public Person(){} // 기본 생성
	// 생성자 메소드 : public + class(), no return
	public Person() {
		name = "익명";
		height = 170.0;
		System.out.println("한 사람을 생성!");
	}
	
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
		System.out.println("한 사람을 생성!");
	}
	// toString 메소드
	public String toString() {
		String text = "이름 : "+name+", 키 : "+height;
		return text;
	}
	// get, set method
//	public String getName() {
//		return name;
//	}
//	public double getHeight() {
//		return height;
//	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setHeight(double height) {
//		this.height = height;
//	}
}
