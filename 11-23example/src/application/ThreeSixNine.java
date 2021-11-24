package application;

import java.util.Scanner;

public class ThreeSixNine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~99의 정수를 입력하시오 >> ");
		int num = sc.nextInt();
		int count = 0;
		if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9) { // 10의자리 3,6,9찾은 후 count증가
			count++;
		}
		if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) { // 1의자리 3,6,9 찾은 후 count증가
			count++;
		}
		if (count == 0) {
			System.out.println("3,6,9가 없습니다.");
		} else {
			if (count == 1) {
				System.out.println("박수짝");
			} else {
				System.out.println("박수짝짝");
			}
		}
		sc.close();
	}

}
