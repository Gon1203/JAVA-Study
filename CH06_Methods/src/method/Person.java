package method;

public class Person {
	// 클래스 안의 일반 변수 => 인스턴스 변수 (객체 생성시 생성됨)
	String name;
	int age;

	// class 안에 만든 함수를 메소드라 함 => 객체 생성시 사용 가능
	void sayHello() {
		System.out.println("hello "+name);
	}
}
