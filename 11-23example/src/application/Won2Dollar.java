package application;

import java.util.Scanner;

public class Won2Dollar {

	public static void main(String[] args) {
		int won = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원) >> ");
		won = sc.nextInt();
		cal(won);
		sc.close();
		
	}
	public static void cal(int a) {
		double b = a / 1216;
		System.out.printf("%d원은 $%.2f달러 입니다.",a,b);
	}

}
