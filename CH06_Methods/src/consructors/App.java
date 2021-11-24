package consructors;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setName("춘식이");
		p1.setHeight(80.0);
		// 기본 생성자는 생략 가능
		Person p2 = new Person();
		p2.setName("라이언");
		p2.setHeight(120.0);
		Person p3 = new Person();
//		p3.setName("어피치");
//		p3.setHeight(110.0);

		System.out.printf("이름 : %s , 키 : %.1f\n", p1.getName(), p1.getHeight());
		System.out.printf("이름 : %s , 키 : %.1f\n", p2.getName(), p2.getHeight());
		System.out.printf("이름 : %s , 키 : %.1f\n", p3.getName(), p3.getHeight());
	}

}
