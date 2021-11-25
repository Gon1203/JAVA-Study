package application;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// 5. 양의 정수를 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하여라.
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력 하시오 >> ");
		int n[] = new int[10];
		for(int i = 0; i < 10; i++) {
			n[i]= sc.nextInt();
		}

		System.out.print("3의 배수는 >> ");
		for(int i = 0; i < n.length; i++) {
			if(n[i]%3 == 0) {
				System.out.print(n[i]+" ");
			}
		}
		sc.close();
	}

}
