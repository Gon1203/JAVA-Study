package application;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력 >> ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		cal(x, y, z);
		sc.close();

	}

	public static void cal(int a, int b, int c) {
		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("삼각형이 됩니다.");

		} else {
			System.out.println("삼각형이 안됩니다.");
		}
	}
}
