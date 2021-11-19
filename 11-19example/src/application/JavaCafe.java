package application;

public class JavaCafe {

	public static void main(String[] args) {
		printPay(10.00, 40);
		printPay(10.00, 50);
		printPay(7.50, 38);
		printPay(8.50, 66);
	}

	public static void printPay(double basePay, int hours) {
		double pay = 0.0;
		boolean c1 = false;
		if (basePay >= 8.0) {
			if (hours > 40 && hours < 60) {
				pay = (hours - 40) * 1.5 * basePay + 40 * basePay;
				c1 = true;
			} else if (hours <= 40) {
				pay = hours * basePay;
				c1 = true;
			} else {
				System.out.println("초과 근무시간 에러!");
			}
		} else {
			System.out.println("최저 시급 에러!");
		}
		if (c1 == true) {
			System.out.printf("$ %.2f\n", pay);
		}

	}
}
