package application;

public class PreAndPost {

	public static void main(String[] args) {
		// 증감연산자 ++ -- 위치에 따른 경우
		int x = 5;
		System.out.println(x++);
		System.out.println(x);
		
		int y = 3;
		System.out.println(++y);
		
		int z = 10;
		
		int sum = x + z++;
		System.out.println(sum);
		
		int apples = 5;
		int bananas = 4;
		
		int fruits = ++apples + bananas++;
		System.out.println(fruits);

	}

}
