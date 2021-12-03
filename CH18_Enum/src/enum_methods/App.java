package enum_methods;

public class App {

	public static void main(String[] args) {
		// enum에서 사용하는 메소드
//		Fruit[] fruits = Fruit.values(); // values : enum의 모든 상수들을 배열로 리턴함
//		
//		for(Fruit f : fruits) {
//			System.out.println(f);
//		}

		for (Fruit f : Fruit.values()) {
			System.out.println(f);
		}

		// ordinal() : enum의 상수의 순서(index number)

		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());

		// valueOf("상수값") : 상수값과 같은 enum을 찾음
		Fruit f1 = Fruit.valueOf("ORANGE");
		System.out.println(f1);
		System.out.println(f1 == Fruit.ORANGE);

		System.out.println(Fruit.APPLE);
		System.out.println(Fruit.BANANA);
		System.out.println(Fruit.ORANGE);
		
		
	}

}
