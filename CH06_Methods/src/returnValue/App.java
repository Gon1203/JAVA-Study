package returnValue;

public class App {
	public static void main(String[] args) {
		// 리턴값이 있는 메소드 사용
		ReturnMethod m1 = new ReturnMethod();

		String cat = m1.getAnimal();
		System.out.println("캣 변수는 : " + cat);
	}
}
