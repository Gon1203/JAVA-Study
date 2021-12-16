package numbering;

public class App {

	public static void main(String[] args) {
		/*
		 * 10진수 decimal 0-9 
		 * 2진수 binary 0-1(컴퓨터) 
		 * 16진수 hexadecimal 0-F
		 * 
		 * 1234 
		 * 0,1,10,111,110,101 ... 
		 * A0, FB, CD, FFFF ...
		 * 
		 */
		// 16진수를 리터럴(값) 표시할 때 0x를 먼저 붙임 2진수는 0b
		int val = 0b11111111;

		System.out.println("10진수 : " + val);
		System.out.println("2진수 : " + Integer.toBinaryString(val)); // 10진 정수를 -> 2진수로 표현
		System.out.println("16진수 : " + Integer.toHexString(val));
		
		
		
	}

}
