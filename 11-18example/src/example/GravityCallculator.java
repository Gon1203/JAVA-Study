package example;

import java.util.Scanner;

public class GravityCallculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double tZero = 1000;
		double g = -9.81;
		
		System.out.print("시간을 입력해 주세요 :");
		int t = scanner.nextInt();
		double xT = tZero + (g*t*t)/2;
		
		System.out.printf("시간 %d의 위치는 %.2f입니다.",t ,xT);
		scanner.close();
	}

}
