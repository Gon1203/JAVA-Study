package application;

import java.util.Scanner;

public class Rectangle2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 점 (x,y) (x,y)의 좌표를 입력하시오 >> ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		// 충돌 case = 4개 점 (x1,y1) or (x2,y2) or (x1, y2) or (x2, y1) 점이 100,100 200,200
		// 사각형 안에 하나라도 있을 경우
		inRect(x, y, x2, y2);
		sc.close();
	}

	public static void inRect(int x1, int y1, int x2, int y2) {
		if ((x1 >= 100 && x1 <= 100) && (y1 >= 100 && y1 <= 200) || (x1 >= 100 && x1 <= 200) && (y2 >= 100 && y2 <= 200)
				|| (x2 >= 100 && x2 <= 200) && (y1 >= 100 && y1 <= 200)
				|| (x2 >= 100 && x2 <= 200) && (y2 >= 100 && y2 <= 200))
			System.out.println("사각형이 겹칩니다.");
		else
			System.out.println("사각형이 겹치지 않습니다.");
	}

}
