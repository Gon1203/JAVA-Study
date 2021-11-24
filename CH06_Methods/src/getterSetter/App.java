package getterSetter;

public class App {

	public static void main(String[] args) {
		// 인스턴스 변수에 접근하는 메소드 get과 set
		Person p1 = new Person();
		// p1.name = "춘식이";// 보안상 객체의 변수에 바로 접근하지 못함
		p1.setName("춘식이");
		System.out.println(p1.getName());
		
		p1.setAge(3);
		System.out.println(p1.getAge());
		
		Person p2 = new Person();
		
		p2.setName("라이언");
		System.out.println(p2.getName());
		p2.setAge(11);
		System.out.println(p2.getAge());
	}

}
