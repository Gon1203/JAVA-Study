package getterSetter;

public class Person {
	private String name;
	private int age;

	// public은 다른 클래스에서 쓸수 있음
	public void setName(String name) {
		this.name = name; // 이때 this는 인스턴스 의미
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		System.out.println(this);
		this.age = age;
	}

	public int getAge() {
		System.out.println(this);
		return age;
	}
}
