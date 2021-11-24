package application;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("연산 >> ");
		double x = sc.nextDouble();
		String t = sc.next();
		double y = sc.nextDouble();

		double result = 0.0;
		if (t.equals("+")) {
			result = x + y;
		} else if (t.equals("-")) {
			result = x - y;
		} else if (t.equals("*")) {
			result = x * y;
		} else if (t.equals("/")) {
			if (y != 0) {
				result = x / y;
			} else {
				System.out.println("0으로 나눌 수 없어요!");
				return;
			}
		} else {
			System.out.println("잘못된 입력");
			return;
		}
		System.out.println(x + t + y + "의 계산 결과는 " + result);
		sc.close();
	}

}
