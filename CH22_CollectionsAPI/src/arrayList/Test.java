package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<Double> numbers = new ArrayList<>();

		int total = 0;
		double avg = 0;
		while (true) {
			System.out.print("숫자 또는 'q' 입력 > ");

			String input = scanner.nextLine();
			input = input.trim(); // 공백 제거
			if (input.equalsIgnoreCase("q")) {
				break;
			}
			try {
				double value = Double.parseDouble(input); // 문자열 => 실수로 변환
				numbers.add(value); // 실수로 변환된 값을 리스트에 입력
				total += value;

			} catch (NumberFormatException e) {
				System.out.println("실수를 입력해 주세요");
			}

		}

		scanner.close();// 스캐너 종료
		avg = total / numbers.size();
		System.out.println();
		if (numbers.size() > 0) { // 입력된 숫자가 1개 이상이면 출력
			System.out.println("입력된 숫자 : ");
			for (Double d : numbers) {
				System.out.printf("%.2f\n", d);
			}
			System.out.println("평균값 : " + avg);
		} else {
			System.out.println("숫자가 입력되지 않음!");
		}

	}
}
