package consructors;

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
	// get, set method
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
}
