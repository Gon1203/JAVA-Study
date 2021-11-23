package application;

import java.util.Scanner;

public class DivAndRemains {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		System.out.print("2자리수 정수 입력(10~99) >> ");
		x = sc.nextInt();
		if(x >= 10 && x <100) {
			cal(x);
		}else {
			System.out.println("범위 내의 정수를 입력 하세요");
		}
		sc.close();
	}
	public static void cal(int a) {
		int y = 0;
		int z = 0;
		y = a / 10;
		z = a % 10;
		if(y == z) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}else {
			System.out.println("10의 자리와 1의 자리가 다릅니다.");
		}
	}
}
