package example;

public class Profile {

	public static void main(String[] args) {
		String name = "홍팍";
		int age = 35;
		double tall = 176.4;
		boolean begin = true;
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("신장 : %.1f\n", tall);
		System.out.printf("입문자입니까? %b ", begin);
	}

}
