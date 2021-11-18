package example;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 a : ");
		int a = scanner.nextInt();
		System.out.print("정수 b : ");
		int b = scanner.nextInt();
		System.out.println("곱하기 : "+ (a*b));
		System.out.println("나누기 몫 : "+ (a/b));
		System.out.println("나누기 나머지 : "+(a%b));
		scanner.close();
	}

}
