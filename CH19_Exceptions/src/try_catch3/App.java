package try_catch3;

import java.util.Scanner;

public class App {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 예외를 처리하는 try-catch 문
		
		int number = getNumber();

			System.out.println("입력한 숫자는 : " + number);
			scanner.close();

	}

	private static int getNumber() {
		int number = 0;
		boolean isNumber = false;
		
		// 숫자를 입력할 때 까지 반복
		do {
			System.out.print("숫자를 입력 : ");
			String line = scanner.nextLine();
			
			try { // 예외가 발생할 수 있는 코드를 적음
				number = Integer.parseInt(line); // 문자열을 정수로 변환
//			Double.parseDouble(line);	// 문자열을 실수로 변환
//			Long.parseLong(line);
//			Float.parseFloat(line);
				isNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("정수로 변환할 수 없습니다.");
			}
			
		}while(!isNumber);
		return number;
	}

}
