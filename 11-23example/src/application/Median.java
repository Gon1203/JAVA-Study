package application;

import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력 >> ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		cal(x,y,z);
		sc.close();
	}
	public static void cal(int a, int b, int c) {
		int center = 0;
		if(a > b && a < c) {
			center = a;
			System.out.printf("중간값은 %d",center);
		}else if(b>a && b<c) {
			center = b;
			System.out.printf("중간값은 %d",center);
		}else {
			center = c;
			System.out.printf("중간값은 %d",center);
		}
	}
}
