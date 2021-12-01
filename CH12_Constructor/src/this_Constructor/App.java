package this_Constructor;


public class App {

	public static void main(String[] args) {
		// this 생성자
		Person p = new Person();
		System.out.println(p); // p.toSting 이 생략
		Person p2 = new Person("홍길동");
		System.out.println(p2);
		Person p3 = new Person("춘식", 3);
		System.out.println(p3);
	}

}
