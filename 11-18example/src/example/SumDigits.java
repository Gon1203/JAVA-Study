package example;

public class SumDigits {

	public static void main(String[] args) {
		int a = 374;
		int oneDigit = a % 10;
		int tenDigit = (a / 10) % 10;
		int hunDigit = a / 100;
		System.out.println(oneDigit+tenDigit+hunDigit);
	}

}
