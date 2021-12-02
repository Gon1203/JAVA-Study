package static_InnerClass;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();

		p1.print();
		// 외부로 내부 클래스를 불러올때
		// 1. 내부클래스 (외부클래스의 객체가 필요함)
		Person.Head head = p1.new Head();
		head.print();

		// 2. 스테틱 내부 클래스 (외부클래스 이름으로 객체 생성)
		Person.Body body = new Person.Body();
		body.print();
	}

}
