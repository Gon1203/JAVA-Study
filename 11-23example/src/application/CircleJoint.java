package application;

import java.util.Scanner;

public class CircleJoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원1의 중심(m,n)을 입력하세요 >> ");
		double m = sc.nextDouble();
		double n = sc.nextDouble();
		System.out.print("원1의 반지름 r1을 입력하세요 >>");
		double r1 = sc.nextDouble();

		System.out.print("원2의 중심(x,y)을 입력하세요 >> ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		System.out.print("원1의 반지름 r2을 입력하세요 >>");
		double r2 = sc.nextDouble();

		double lSquare = Math.sqrt((m - x) * (m - x) + (n - y) * (n - y));

		if (r1 + r2 >= lSquare) {
			System.out.print("두 원은 서로 겹친다");
		} else
			System.out.print("두 원은 안겹친다.");

		sc.close();
	}

}
