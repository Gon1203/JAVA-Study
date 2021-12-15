package lambda;

interface LambdaClass {
	void run();
}

interface Calculate {
	public int compute(int a, int b);
}

interface StrReverse {
	public String compute(String s);
}

interface Facto{
	public int compute(int n);
}

public class Ex1 {

	public static void main(String[] args) {
		LambdaClass lambda = () -> {
			System.out.println("두 줄 이상일때 중괄호 필요");
			System.out.println("이름없는 클래스 객체가 걷는다.");
		};
		lambda.run();

		LambdaClass hello = () -> System.out.println("hello!");
		hello.run();

		Calculate cal = (n1, n2) -> n1 + n2;
		System.out.println(cal.compute(10, 10));

		Calculate cal2 = (n1, n2) -> {
			if (n2 == 0) {
				return 0;
			}
			return n1 / n2;
		};
		Calculate cal3 = (a, b) -> (b == 0) ? 0 : a / b; // 삼항연산자 이용
		System.out.println(cal2.compute(10, 2));
		System.out.println(cal3.compute(9, 3));

		StrReverse rev = (s) -> {
			String result = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				result += s.charAt(i);
			}
			return result;
		};
		System.out.println(rev.compute("hahahaho"));
		
		Facto rial = (n) -> {
			int result = 1;
			for(int i = 1; i <= n; i++) {
				result = i*result;
			}
			return result;
		};
		System.out.println(rial.compute(4));

	}
}
