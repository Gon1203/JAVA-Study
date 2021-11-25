package application;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// Scanner 에 문자열 입력기능은 없음
		// String s = sc.next();
		// Char s.char(0); << 문자열의 첫 문자를 입력 받는 코드를 사용해야함
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력 하세요 >> ");
		String a = sc.next();
		char c = a.charAt(0);

		for(int i = 0; i <= c - 'a'; i++) {
			for(char j = 'a'; j <= c -i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}

}
