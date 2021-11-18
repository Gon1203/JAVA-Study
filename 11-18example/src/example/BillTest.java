package example;

import java.util.Scanner;

public class BillTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int price = scanner.nextInt();
		int oman = 0;
		int man = 0;
		int ochun = 0;
		int chun = 0;
		int totalCount = 0;
		int discount = 0;
		while(price > 50000) {
			price -= 50000;
			oman++;
		}
		while(price > 10000) {
			price -= 10000;
			man++;
		}
		while(price > 5000) {
			price -= 5000;
			ochun++;
		}
		while(price>1000){
			price -=1000;
			chun++;
		}
		discount = price;
		price = oman * 50000 + man * 10000 + ochun * 5000 + chun * 1000 + discount;

		totalCount = oman + man + ochun + chun;

		System.out.printf("5만원 : %d\n", oman);
		System.out.printf("만원 : %d\n", man);
		System.out.printf("5천원 : %d\n", ochun);
		System.out.printf("천원 : %d\n", chun);
		System.out.printf("총 장수 : %d\n", totalCount);
		System.out.printf("금액 : %d\n", price);
		System.out.printf("할인 : %d\n", discount);
		scanner.close();
	}

}
