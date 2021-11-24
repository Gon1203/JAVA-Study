package consructorsParameter;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("춘식이", 80.0);
		// 기본 생성자는 생략 가능
		Person p2 = new Person();
		Person p3 = new Person("어피치", 110.0 );

//		System.out.printf("이름 : %s , 키 : %.1f\n", p1.getName(), p1.getHeight());
//		System.out.printf("이름 : %s , 키 : %.1f\n", p2.getName(), p2.getHeight());
//		System.out.printf("이름 : %s , 키 : %.1f\n", p3.getName(), p3.getHeight());
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}

}
