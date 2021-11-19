package application;

public class StringArray {
	public static void main(String[] args) {
		String[] animal = {"고양이", "개", "펭귄","사자"};
		
		System.out.println(animal[0]);
		System.out.println(animal[1]);
		System.out.println(animal[2]);
		System.out.println(animal[3]);
		
		// 배열안의 값을 바꾸는 방법
		animal[0] = "닭";
		System.out.println(animal[0]);
		System.out.println(animal[1]);
		System.out.println(animal[2]);
		System.out.println(animal[3]);
		
		
		
	}
}
