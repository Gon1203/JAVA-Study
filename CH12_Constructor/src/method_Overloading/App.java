package method_Overloading;

public class App {

	public static void main(String[] args) {
		// 메소드 오버로딩
		Person p = new Person();

		p.greet();
		p.greet("춘식");
		
		System.out.println();
		System.out.println();
		
		p.greet(210);
		p.greet("펭수", 210);
	}

}
