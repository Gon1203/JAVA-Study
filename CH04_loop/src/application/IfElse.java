package application;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 스캐너
		Scanner scanner = new Scanner(System.in);
		System.out.println("사과의 갯수는?");
		int apple = scanner.nextInt();
		System.out.println("바나나의 갯수는?");
		int banana = scanner.nextInt();

		// IF 조건문
		if (apple > banana) { // 거짓
			System.out.println("사과가 바나나보다 많음");
		}
		else {	// 위의 if문의 조건이 참이 아닐 경우 실행
			System.out.println("바나나가 사과보다 많음 ");
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
