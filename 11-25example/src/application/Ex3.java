package application;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 >> ");
		int stars = sc.nextInt();
		
		for(int i = 0; i < stars; i++) {
			for(int j =0; j < stars-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
