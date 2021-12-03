package try_catch;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// 예외를 처리하는 try-catch 문
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자를 입력 : ");
		String line = scanner.nextLine();

		int number = 0;
		scanner.close();
		boolean isNumber = false;
		try { // 예외가 발생할 수 있는 코드를 적음
			number = Integer.parseInt(line); // 문자열을 정수로 변환
//			Double.parseDouble(line);	// 문자열을 실수로 변환
//			Long.parseLong(line);
//			Float.parseFloat(line);
			isNumber = true;
		} catch (NumberFormatException e) {
			System.out.println("정수로 변환할 수 없습니다.");
		}
		if (isNumber) {
			System.out.println("입력한 숫자는 : " + number);

		}
	}

}
