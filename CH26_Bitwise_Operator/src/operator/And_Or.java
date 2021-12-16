package operator;

public class And_Or {

	public static void main(String[] args) {
		// 비트 and or 연산
		int v1 = 0b01010011;
		int v2 = 0b11010110;
		int result1 = v1 & v2; // and 비트 연산
		System.out.println(result1);
		System.out.println(toBinary(v1));
		System.out.println(toBinary(v2));
		System.out.println(toBinary(result1));
		
		System.out.println();
		int result2 = v1 | v2;	// or 비트 연산
		System.out.println(toBinary(v1));
		System.out.println(toBinary(v2));
		System.out.println(toBinary(result2));
		

	}

	public static String toBinary(int value) { // 이진수 문자열로 출력
		// String.format은 printf처럼 사용하면 문자열로 리턴
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
	}
}
