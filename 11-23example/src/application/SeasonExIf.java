package application;

import java.util.Scanner;

public class SeasonExIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하세요 (1~12) >> ");
		int n = sc.nextInt();

		// if-else 문 사용
//		if(n >=3 && n <= 5)
//			System.out.println("봄");
//		if(n >=6 && n <= 8)
//			System.out.println("여름");
//		if(n >=9 && n <= 11)
//			System.out.println("가을");
//		if(n == 1 || n == 2 || n == 12)
//			System.out.println("겨울");
//		sc.close();

		// switch 문 사용
		switch (n) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 1:
		case 2:
		case 12:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못된 입력");
		}

	}

}
