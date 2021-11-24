package application;

import java.util.Scanner;

public class CircleInclusion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 중심(m,n)을 입력하세요 >> ");
		double m = sc.nextDouble();
		double n = sc.nextDouble();
		System.out.print("원의 반지름 r을 입력하세요 >>");
		double r = sc.nextDouble();

		System.out.print("점 입력 >> ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();

		double lSquare = Math.sqrt((m - x) * (m - x) + (n - y) * (n - y));

		if (r >= lSquare) {
			System.out.printf("점 %.1f, %.1f 는 원 안에 있다.", x, y);
		}else
			System.out.printf("점 %.1f, %.1f 는 원 안에 없다.", x, y);
	}

}
