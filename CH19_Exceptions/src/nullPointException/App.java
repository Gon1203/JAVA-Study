package nullPointException;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// 널포인트 예외는 RuntimeException으로 예외처리 안해도 됨
		
		// 런타임 예외 예
//		System.out.println(5/0);
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at nullPointException.App.main(App.java:11)

		
		// 널포인트 예외, 객체가 널값인데 사용할 경우
//		Scanner sc = null;
//		sc.nextInt();
//		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.util.Scanner.nextInt()" because "sc" is null
//		at nullPointException.App.main(App.java:15)

		
	}

}
