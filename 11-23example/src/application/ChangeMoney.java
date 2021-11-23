package application;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		int x = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >> ");
		x = sc.nextInt();
		cal(x);
		sc.close();
		
	}
	public static void cal(int a) {
		int cnt = a / 50000;
		a %= 50000;
		System.out.printf("오만원권 %d 매\n",cnt);
		cnt = a / 10000;
		a %= 10000;
		System.out.printf("만원권 %d 매\n",cnt);
		cnt = a / 1000;
		a %= 1000;
		System.out.printf("천원권 %d 매\n",cnt);
		cnt = a / 500;
		a %= 500;
		System.out.printf("오백원 %d 매\n",cnt);
		cnt = a / 100;
		a %= 100;
		System.out.printf("백원 %d 매\n",cnt);
		cnt = a / 50;
		a %= 50;
		System.out.printf("오십원 %d 매\n",cnt);
		cnt = a / 10;
		a %= 10;
		System.out.printf("십원 %d 매\n",cnt);
		cnt = a % 10;
		System.out.printf("일원 %d 매\n",cnt);
	}
}
