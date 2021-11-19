package application;

public class LoopArray {
	public static void main(String[] args) {
		String[] animal = { "고양이", "개", "펭귄", "사자" };
//		
//		System.out.println(animal[0]);
//		System.out.println(animal[1]);
//		System.out.println(animal[2]);
//		System.out.println(animal[3]);

		for (int i = 0; i < animal.length; i++) {
			System.out.printf("인덱스 %d의 값은 %s이다.\n", i, animal[i]);
		}

	}
}
