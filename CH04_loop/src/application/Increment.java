package application;

public class Increment {

	public static void main(String[] args) {
		// 증가 감소 연산자
		int a = 0;

		a = a + 1;
		System.out.println(a);
		a += 1;				// 1씩 증가, c-= 2 => c-2
		System.out.println(a);
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		
		// 위와 같이 4가지 방법으로 1씩 감소 시켜라
		
		int b = 4;
		System.out.println("b"+b);
		b = b - 1;
		System.out.println("b"+b);
		b -= 1;
		System.out.println("b"+b);
		b--;
		System.out.println("b"+b);
		--b;
		System.out.println("b"+b);
	}

}
