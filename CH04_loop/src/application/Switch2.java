package application;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// Switch문자 입력 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("계속 진행 하겠습니까? (y/n): ");
		String input = scanner.nextLine();

		switch (input) {
		case "y": // 옵션 변수가 케이스 0과 같을때
			System.out.println("계속진행합니다");
			break; // 항상 케이스 하나 끝에 break작성
		case "n": // 옵션 변수가 케이스 1과 같을때
			System.out.println("종료합니다");
			break;
		default: // case와 같은 값이 없을 때 default실행
			System.out.println("잘못된 입력");
			break;
		}
		scanner.close();

	}

}
