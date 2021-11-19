package application;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// do while은 처은 한번은 조건과 상관없이 실행하는 반복문
//		int count = 100;
//
//		System.out.println("do while 반복문");
//
//		do { // do로 한번은 실행
//			System.out.println("카운트 : " + count);
//		} while (count++ < 5); // false라 실행 x
		final String USER_PASSWORD = "hello";

		Scanner scanner = new Scanner(System.in);
		String password = ""; // 전역변수 password 선언

		do {
			System.out.print("비밀번호를 입력하세요 > ");
			password = scanner.nextLine();
		} while (!password.equals(USER_PASSWORD));
		System.out.println("접속승인");
		scanner.close();
	}

}